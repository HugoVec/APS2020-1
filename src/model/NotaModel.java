/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.DatabaseConnection;
import entity.Nota;
/**
 *
 * @author Huga Savioli
 */
public class NotaModel {
    
    public static boolean salvar(Nota nota) throws SQLException {
        String sql = "INSERT INTO NOTA (NP1, NP2, SUB, EXAME)  VALUES (?, ?, ?, ?) ";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setInt(1, nota.getNp1());
        stmt.setInt(2, nota.getNp2());
        stmt.setInt(3, nota.getSub());
        stmt.setInt(4, nota.getExame());

        return stmt.executeUpdate() > 0;
    }

    public static boolean deletar(String nota) throws SQLException {
        String sql = "DELETE FROM NOTA WHERE ID = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, nota);

        return stmt.executeUpdate() > 0;
    }

    public static Nota encontrar(String id) throws SQLException {
        String sql = "SELECT * FROM NOTA WHERE ID_ALUNO = ?";

        PreparedStatement stmt = DatabaseConnection.getConnection().prepareStatement(sql);
        stmt.setString(1, id);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return new Nota(
                    rs.getInt("np1"),
                    rs.getInt("np2"),
                    rs.getInt("sub"),
                    rs.getInt("exame"));
            
        }

        return null;
    }

    
}
