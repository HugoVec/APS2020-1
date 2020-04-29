package entity;

public class Student {
    private Integer id;
    private String name;
    private byte semestre;
    private Curso curso;

    public Student() {
        
    }    
    
    public Student(Integer id, String name, byte semestre, Curso curso) {
        this.id = id;
        this.name = name;
        this.semestre = semestre;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
