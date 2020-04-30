package entity;

import java.sql.SQLException;

public interface IEntity {
    boolean salvar() throws SQLException;
    boolean deletar() throws SQLException;
}
