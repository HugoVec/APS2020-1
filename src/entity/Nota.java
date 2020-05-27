package entity;

public class Nota {

    private Integer ID;
    private int np1;
    private int np2;
    private int sub;
    private int exame;

    private Disciplina disciplina;

    public Nota() {
    }

    public int getNp1() {
        return np1;
    }

    public void setNp1(int np1) {
        this.np1 = np1;
    }

    public int getNp2() {
        return np2;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }
    
    

    public void setNp2(int np2) {
        this.np2 = np2;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getExame() {
        return exame;
    }

    public void setExame(int exame) {
        this.exame = exame;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
