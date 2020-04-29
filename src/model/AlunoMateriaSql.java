package model;

import entity.AlunoMateria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlunoMateriaSql {
    private Connection conn = DatabaseConnection.getConnection();
    
    public boolean createAlunoMateria(AlunoMateria alunoMateria) throws SQLException {
       String sql = "INSERT INTO ALUNO_MATERIA (ALUNO_ID, MATERIA_ID, NP1, NP2, SUB, EXAME) VALUES(?,?,?,?,?,?)";
       PreparedStatement stmt = conn.prepareStatement(sql);  
       stmt.setInt(1, alunoMateria.getAlunoId());
       stmt.setInt(2, alunoMateria.getMateriaId());
       stmt.setDouble(3, alunoMateria.getPrimeiraNota());
       stmt.setDouble(4, alunoMateria.getSegundaNota());
       stmt.setDouble(5, alunoMateria.getSub());
       stmt.setDouble(6, alunoMateria.getExame());
       return stmt.executeUpdate() > 0;
    }
    
    public boolean updateAlunoMateria(AlunoMateria alunoMateria) throws SQLException {
       String sql = "UPDATE ALUNO_MATERIA SET MATERIA_ID, = ?, NP1 = ?, NP2 = ?, SUB = ?, EXAME = ? WHERE ALUNO_ID = ?;";
       PreparedStatement stmt = conn.prepareStatement(sql);
       stmt.setInt(1, alunoMateria.getMateriaId());
       stmt.setDouble(2, alunoMateria.getPrimeiraNota());
       stmt.setDouble(3, alunoMateria.getSegundaNota());
       stmt.setDouble(4, alunoMateria.getSub());
       stmt.setDouble(5, alunoMateria.getExame());
       stmt.setInt(6, alunoMateria.getAlunoId());
       return stmt.executeUpdate() > 0;
    }    
    
    public boolean deleteAlunoMateria(AlunoMateria alunoMateria) throws SQLException {
        String sql = "DELETE FROM ALUNO_MATERIA WHERE ID = '?' ;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, alunoMateria.getAlunoId());
        return stmt.executeUpdate() > 0;
    }    
    
    public AlunoMateria getAlunoMateria(Integer ID) throws SQLException {
        String sql = "SELECT * FROM ALUNO_MATERIA WHERE ALUNO_ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, ID);
        ResultSet resultado = stmt.executeQuery();
        if (resultado.next()) {    
            AlunoMateria alunoMateria = new AlunoMateria();
            alunoMateria.setAlunoId(resultado.getInt("ALUNO_ID"));
            alunoMateria.setMateriaId(resultado.getInt("MATERIA_ID"));
            alunoMateria.setPrimeiraNota(resultado.getDouble("NP1"));
            alunoMateria.setSegundaNota(resultado.getDouble("NP2"));
            alunoMateria.setSub(resultado.getDouble("SUB"));
            alunoMateria.setExame(resultado.getDouble("EXAME"));            
            return alunoMateria;
        } 
        return null;
    }
}    
