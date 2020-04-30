package entity;

import java.util.ArrayList;

public class Professor {
    private Integer ID;
    private String nome;
    private String nivel;
    private double salario;

    private ArrayList<Aula> aulas;

    public Professor() {}

    public Professor(Integer ID, String nome, String nivel, double salario) {
        this.ID = ID;
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
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

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }
}
