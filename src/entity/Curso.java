package entity;

import model.CursoModel;

import java.sql.SQLException;
import java.util.ArrayList;

public class Curso implements IEntity {
    private Integer ID;
    private String nome;
    private Double mensalidade;

    public Curso() {}
    
    public Curso(Integer ID, String nome, Double mensalidade){
        this.ID = ID;
        this.nome = nome;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public boolean salvar() throws SQLException {
        return CursoModel.salvar(this);
    }

    @Override
    public boolean deletar() throws SQLException {
        return CursoModel.deletar(this);
    }
    
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Mensalidade: " + mensalidade + "\n";
    }
    
    
}