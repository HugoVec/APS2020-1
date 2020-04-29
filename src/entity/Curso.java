package entity;

public class Curso {
    private String nome;
    private Integer id;
    private Double mensalidade;

    public Curso() {
        
    }
    
    public Curso(String nome, Integer id, Double mensalidade){
        this.nome = nome;
        this.id = id;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }
}