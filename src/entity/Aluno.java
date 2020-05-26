package entity;

import model.AlunoModel;

import java.sql.SQLException;
import java.util.ArrayList;

public class Aluno implements IEntity {

    private Integer ID;
    private String documento;
    private String nome;
    private String sexo;
    private int idade;

    private int curso;

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    

    public Aluno() {
    }

    public Aluno(Integer ID, String documento, String nome, String sexo, int idade) {
        this.ID = ID;
        this.documento = documento;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean salvar() throws SQLException {
        return AlunoModel.salvar(this);
    }

    @Override
    public boolean deletar() throws SQLException {
        return AlunoModel.deletar(this);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "RA: " + documento + "\n";
    }

}
