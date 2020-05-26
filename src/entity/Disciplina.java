package entity;

import java.util.ArrayList;

public class Disciplina {
    private Integer ID;
    private String nome;

    public Disciplina() {}

    public Disciplina(Integer ID, String nome, boolean optativa) {
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

}
