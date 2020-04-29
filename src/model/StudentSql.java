package model;

import entity.Curso;
import entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentSql {
    private Connection conn = DatabaseConnection.getConnection();
    
    public boolean createStudent(Student student) throws SQLException {
       String sql = "INSERT INTO ALUNO (ID,CURSO,SEMESTRE,NOME) VALUES(?,?,?,?)";
       PreparedStatement stmt = conn.prepareStatement(sql);  
       stmt.setInt(1, student.getId());
       stmt.setInt(2, student.getCurso().getId());
       stmt.setByte(3, student.getSemestre());
       stmt.setString(4, student.getName());
       return stmt.executeUpdate() > 0;
    }
    
    public boolean updateStudent (Student student) throws SQLException {
        String sql = "UPDATE aluno SET curso = ?, semestre = ?, nome = ? WHERE id = ?;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, student.getCurso().getId());
        stmt.setByte(2, student.getSemestre());
        stmt.setString(3, student.getName());
        stmt.setInt(4, student.getId());
        return stmt.executeUpdate() > 0;
    }    
    
    public boolean deleteStudent (Student student) throws SQLException {
        String sql = "DELETE FROM ALUNO WHERE ID = '?' ";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, student.getId());
        return stmt.executeUpdate() > 0;
    }
    
    public Student getStudent(Integer ID) throws SQLException {
        String sql = "SELECT * FROM ALUNO WHERE ID = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, ID);
        ResultSet resultado = stmt.executeQuery();
        if (resultado.next()) {    
            CursoSql cursoSql = new CursoSql();
            int cursoId = resultado.getInt("CURSO_ID");
            Curso curso = cursoSql.getCurso(cursoId);
            Student student = new Student();
            student.setId(resultado.getInt("ID"));
            student.setCurso(curso);
            student.setSemestre(resultado.getByte("SEMESTRE"));
            student.setName(resultado.getString("NOME"));            
            return student;
        } 
        return null;
    }
}    