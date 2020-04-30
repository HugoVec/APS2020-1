package model;

import entity.Aluno;
import entity.Matricula;
import jdbc.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MatriculaModel {
    public static boolean salvar(Matricula matricula) throws SQLException {
        String sql = "INSERT INTO MATRICULA (ID_ALUNO, ID_TURMA, DESCONTO, ATIVO, DATA_FINALIZACAO)  VALUES (?, ?, ?, ?, ?) " +
                "ON CONFLICT (ID) DO UPDATE " +
                "SET ID_ALUNO = EXCLUDED.ID_ALUNO," +
                "    ID_TURMA = EXCLUDED.ID_TURMA," +
                "    DESCONTO = EXCLUDED.DESCONTO," +
                "    ATIVO = EXCLUDED.ATIVO, " +
                "    DATA_FINALIZACAO = EXCLUDED.DATA_FINALIZACAO";

        PreparedStatement ps = DatabaseConnection.getConnection().prepareStatement(sql);
        ps.setInt(1, matricula.getAluno().getID());
        ps.setInt(2, matricula.getTurma().getID());
        ps.setInt(3, matricula.getDesconto());
        ps.setBoolean(4, matricula.isAtivo());
        ps.setDate(5, matricula.getDataFinalizacao());

        return ps.executeUpdate() > 0;
    }

    public static ArrayList<Matricula> encontrarDoAluno(Aluno aluno) throws SQLException {
        String sql = "SELECT * FROM MATRICULA WHERE ID_ALUNO = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, aluno.getID());

        ArrayList<Matricula> matriculas = new ArrayList<>();

        ResultSet rs = stmt.executeQuery();
        while(rs.next()) {
            matriculas.add(new Matricula(
                    rs.getInt("ID"),
                    rs.getInt("DESCONTO"),
                    rs.getBoolean("ATIVO"),
                    rs.getDate("DATA_MATRICULA"),
                    rs.getDate("DATA_FINALIZADO")
            ));
        }

        return matriculas;
    }
}
