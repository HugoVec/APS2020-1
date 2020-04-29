/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
public class Materia {
    private int id;
    private String nome;
    private Integer semestre;

    public Materia() {
        
    }
 
    public Materia(int id, String nome, Integer semestre){
        this.id = id;
        this.nome = nome;
        this.semestre = semestre;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }
}
