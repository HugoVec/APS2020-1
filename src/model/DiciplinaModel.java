/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc.DatabaseConnection;
import entity.Disciplina;
import entity.Curso;


public class DiciplinaModel {
    
    public static boolean salvar(Disciplina diciplina) throws SQLException {
        String sql = "INSERT INTO DICIPLINA (NOME)  VALUES (?) ";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, diciplina.getNome());

        return stmt.executeUpdate() > 0;
    }

    public static boolean deletar(Disciplina diciplina) throws SQLException {
        String sql = "DELETE FROM DICIPLINA WHERE ID = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, diciplina.getID());

        return stmt.executeUpdate() > 0;
    }

    public static Disciplina encontrar(Curso id) throws SQLException {
        String sql = "SELECT * FROM DICIPLINA WHERE ID_CURSO = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, id.getID());

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Disciplina(
                    rs.getInt("ID_CURSO"));
        }

        return null;
    }

    
    
}
