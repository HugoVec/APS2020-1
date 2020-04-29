package model;

import entity.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CursoSql {
    private Connection conn = DatabaseConnection.getConnection();
    
    public boolean createCurso(Curso curso) throws SQLException {
       String sql = "INSERT INTO CURSO (ID,NOME,MENSALIDADE) VALUES(?,?,?)";
       PreparedStatement stmt = conn.prepareStatement(sql);  
       stmt.setInt(1, curso.getId());
       stmt.setString(2, curso.getNome());
       stmt.setDouble(3, curso.getMensalidade());
       return stmt.executeUpdate() > 0;
    }
    
    public boolean updateCurso (Curso curso) throws SQLException {
        String sql = "UPDATE CURSO SET NOME = ?, MENSALIDADE = ? WHERE ID = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, curso.getNome());
        stmt.setDouble(2, curso.getMensalidade());
        stmt.setInt(3, curso.getId());
        return stmt.executeUpdate() > 0;
    }    
    
    public boolean deleteCurso (Curso curso) throws SQLException {
        String sql = "DELETE FROM CURSO WHERE ID = '?' ;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(3, curso.getId());
        return stmt.executeUpdate() > 0;
    }    
    
    public Curso getCurso(Integer ID) throws SQLException {
        String sql = "SELECT * FROM CURSO WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, ID);
        ResultSet resultado = stmt.executeQuery();
        if (resultado.next()) {    
            Curso curso = new Curso();
            curso.setId(resultado.getInt("ID"));
            curso.setNome(resultado.getString("NOME"));
            curso.setMensalidade(resultado.getDouble("MENSALIDADE"));
            return curso;
        } 
        return null;
    }
}    
