package model;

import entity.Curso;
import jdbc.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CursoModel {
    public static boolean salvar(Curso curso) throws SQLException {
        String sql = "INSERT INTO CURSO (ID, NOME, MENSALIDADE)  VALUES (?, ?, ?) " +
                "ON CONFLICT (ID) DO UPDATE" +
                " SET NOME = EXCLUDED.NOME," +
                "     MENSALIDADE = EXCLUDED.MENSALIDADE";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, curso.getID());
        stmt.setString(2, curso.getNome());
        stmt.setDouble(3, curso.getMensalidade());

        return stmt.executeUpdate() > 0;
    }

    public static boolean deletar(Curso curso) throws SQLException {
        String sql = "DELETE FROM CURSO WHERE ID = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, curso.getID());

        return stmt.executeUpdate() > 0;
    }
    
    public static boolean deletar(String nomeC) throws SQLException {
        String sql = "DELETE FROM CURSO WHERE nome = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, nomeC);

        return stmt.executeUpdate() > 0;
    }
    
    public static Curso getCurso(Integer ID) throws SQLException {
        String sql = "SELECT * FROM CURSO WHERE ID = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, ID);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Curso(
                    rs.getInt("ID"),
                    rs.getString("NOME"),
                    rs.getDouble("MENSALIDADE")
            );
        } 
        return null;
    }
    
    
    public static Curso getCurso(String nomeC) throws SQLException {
        String sql = "SELECT * FROM CURSO WHERE nome = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, nomeC);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Curso(
                    rs.getInt("ID"),
                    rs.getString("NOME"),
                    rs.getDouble("MENSALIDADE")
            );
        } 
        return null;
    }
    
    
}    
