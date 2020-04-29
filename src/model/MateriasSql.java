package model;

import entity.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MateriasSql {
    private Connection conn = DatabaseConnection.getConnection();
    
    public boolean createMateria(Materia materia) throws SQLException {
       String sql = "INSERT INTO MATERIA (ID,NOME,SEMESTRE) VALUES(?,?,?)";
       PreparedStatement stmt = conn.prepareStatement(sql);  
       stmt.setInt(1, materia.getId());
       stmt.setString(2, materia.getNome());
       stmt.setInt(3, materia.getSemestre());
       return stmt.executeUpdate() > 0;
    }
    
    public boolean updateMateria(Materia materia) throws SQLException {
        String sql = "UPDATE MATERIA SET NOME = ?, SEMESTRE = ? WHERE ID = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, materia.getNome());
        stmt.setInt(2, materia.getSemestre());
        stmt.setInt(3, materia.getId());
        return stmt.executeUpdate() > 0;
    }    
    
    public boolean deleteMateria(Materia materia) throws SQLException {
        String sql = "DELETE FROM MATERIA WHERE ID = '?' ;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, materia.getId());
        return stmt.executeUpdate() > 0;
    }    
    
    public Materia getMaterias(Integer ID) throws SQLException {
        String sql = "SELECT * FROM MATERIA WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, ID);
        ResultSet resultado = stmt.executeQuery();
        if (resultado.next()) {    
            Materia materia = new Materia();
            materia.setId(resultado.getInt("ID"));
            materia.setNome(resultado.getString("NOME"));
            materia.setSemestre(resultado.getInt("SEMESTRE"));
            return materia;
        } 
        return null;
    }
}    
