package entity;

import model.AlunoModel;
import model.MatriculaModel;

import java.sql.SQLException;
import java.util.ArrayList;

public class Aluno implements IEntity {
    private Integer ID;
    private String documento;
    private String nome;
    private char sexo;
    private short idade;

    private ArrayList<Matricula> matriculas;
    private ArrayList<Turma> turmas;

    public Aluno() {}

    public Aluno(Integer ID, String documento, String nome, char sexo, short idade) {
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public ArrayList<Matricula> getMatriculas() throws SQLException {
        if (matriculas == null) {
            matriculas = MatriculaModel.encontrarDoAluno(this);
        }

        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    @Override
    public boolean salvar() throws SQLException {
        return AlunoModel.salvar(this);
    }

    @Override
    public boolean deletar() throws SQLException {
        return AlunoModel.deletar(this);
    }

    public boolean matricular(Matricula matricula) throws SQLException {
        return AlunoModel.matricular(matricula);
    }
}
