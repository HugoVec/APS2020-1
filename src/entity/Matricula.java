package entity;

import java.sql.Date;
import java.util.ArrayList;

public class Matricula {
    private Integer ID;
    private Integer desconto;
    private boolean ativo;
    private Date dataMatricula;
    private Date dataFinalizacao;

    private Aluno aluno;
    private Turma turma;
    private ArrayList<Nota> notas;

    public Matricula() {}

    public Matricula(Integer ID, Integer desconto, boolean ativo, Date dataMatricula, Date dataFinalizacao) {
        this.ID = ID;
        this.desconto = desconto;
        this.ativo = ativo;
        this.dataMatricula = dataMatricula;
        this.dataFinalizacao = dataFinalizacao;
    }

    public Matricula(Integer desconto, boolean ativo, Date dataMatricula, Date dataFinalizacao, Aluno aluno, Turma turma) {
        this.desconto = desconto;
        this.ativo = ativo;
        this.dataMatricula = dataMatricula;
        this.dataFinalizacao = dataFinalizacao;
        this.aluno = aluno;
        this.turma = turma;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Date getDataFinalizacao() {
        return dataFinalizacao;
    }

    public void setDataFinalizacao(Date dataFinalizacao) {
        this.dataFinalizacao = dataFinalizacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
