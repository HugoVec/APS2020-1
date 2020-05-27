package entity;

import model.CursoModel;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DiciplinaModel;

public class Disciplina implements IEntity {
    private Integer ID;
    private String nome;

    public Disciplina() {}

    public Disciplina(Integer ID, String nome, boolean optativa) {
        this.ID = ID;
        this.nome = nome;
    }

    public Disciplina(int aInt, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean salvar() throws SQLException {
        return DiciplinaModel.salvar(this);
    }

    @Override
    public boolean deletar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
