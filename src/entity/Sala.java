package entity;

import java.util.ArrayList;

public class Sala {
    private Integer ID;
    private String nome;

    private ArrayList<Turma> turmas = new ArrayList<>();

    public Sala() {}

    public Sala(Integer ID, String nome) {
        this.ID = ID;
        this.nome = nome;
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

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
