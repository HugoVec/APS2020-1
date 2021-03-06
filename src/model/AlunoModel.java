package model;

import entity.Aluno;
import entity.Curso;
import jdbc.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoModel {
    public static boolean salvar(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO ALUNO (NOME, SEXO, IDADE, DOCUMENTO)  VALUES (?, ?, ?, ?) " +
                     "ON CONFLICT (DOCUMENTO) DO UPDATE" +
                     " SET NOME = EXCLUDED.NOME," +
                     "     SEXO = EXCLUDED.SEXO," +
                     "     IDADE = EXCLUDED.IDADE," +
                     "     DOCUMENTO = EXCLUDED.DOCUMENTO";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, aluno.getNome());
        stmt.setString(2, String.valueOf(aluno.getSexo()));
        stmt.setInt(3, aluno.getIdade());
        stmt.setString(4, aluno.getDocumento());

        return stmt.executeUpdate() > 0;
    }

    public static boolean deletar(Aluno aluno) throws SQLException {
        String sql = "DELETE FROM ALUNO WHERE ID = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, aluno.getID());

        return stmt.executeUpdate() > 0;
    }
    
    public static boolean deletar(String ra) throws SQLException {
        String sql = "DELETE FROM ALUNO WHERE documento = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, ra);

        return stmt.executeUpdate() > 0;
    }

    public static Aluno encontrar(String documento) throws SQLException {
        String sql = "SELECT * FROM ALUNO WHERE documento = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, documento);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Aluno(
                    rs.getInt("ID"),
                    documento,
                    rs.getString("NOME"),
                    rs.getString("SEXO"),
                    (short) rs.getInt("IDADE"));
        }

        return null;
    }

    public static ArrayList<Aluno> listarTodos() throws SQLException {
        String sql = "SELECT * FROM ALUNO";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);

        ArrayList<Aluno> alunos = new ArrayList<>();

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            alunos.add(new Aluno(
                    rs.getInt("ID"),
                    rs.getString("DOCUMENTO"),
                    rs.getString("NOME"),
                    rs.getString("SEXO"),
                    (short) rs.getInt("IDADE")));
        }

        return alunos;
    }

}