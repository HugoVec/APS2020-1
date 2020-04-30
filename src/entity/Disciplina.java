package entity;

import java.util.ArrayList;

public class Disciplina {
    private Integer ID;
    private String nome;
    private boolean optativa;

    private ArrayList<Aula> aulas = new ArrayList<>();

    public Disciplina() {}

    public Disciplina(Integer ID, String nome, boolean optativa) {
        this.ID = ID;
        this.nome = nome;
        this.optativa = optativa;
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

    public boolean isOptativa() {
        return optativa;
    }

    public void setOptativa(boolean optativa) {
        this.optativa = optativa;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        this.aulas = aulas;
    }
}
