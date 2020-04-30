package entity;

import java.util.ArrayList;

public class Turma {
    private Integer ID;
    private String nome;
    private char Periodo;
    private short anoInicio;
    private byte semestre;

    private Curso curso;
    private Sala sala;
    private ArrayList<Aula> aulas;
    private ArrayList<Matricula> matriculas;

    public Turma() {}

    public Turma(Integer ID, String nome, char periodo, short anoInicio, byte semestre) {
        this.ID = ID;
        this.nome = nome;
        Periodo = periodo;
        this.anoInicio = anoInicio;
        this.semestre = semestre;
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

    public char getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(char periodo) {
        Periodo = periodo;
    }

    public short getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(short anoInicio) {
        this.anoInicio = anoInicio;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
