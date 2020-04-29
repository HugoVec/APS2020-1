package entity;

public class AlunoMateria {
    private int alunoId;
    private int materiaId;
    private double primeiraNota;
    private double segundaNota;
    private double sub;
    private double exame;

    public AlunoMateria() {
        
    }
    
    public AlunoMateria(int alunoId, int materiaId, double primeiraNota, double segundaNota, double sub, double exame){
        this.alunoId = alunoId;
        this.materiaId = materiaId;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.sub = sub;
        this.exame = exame;

}

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getMateriaId() {
        return materiaId;
    }

    public void setMateriaId(int materiaId) {
        this.materiaId = materiaId;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
    }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getExame() {
        return exame;
    }

    public void setExame(double exame) {
        this.exame = exame;
    }

}