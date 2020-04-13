package entity;

public class Student {
    private Integer id;
    private String name;
    private String documentNumber;

    public Student(Integer id, String name, String documentNumber) {
        this.id = id;
        this.name = name;
        this.documentNumber = documentNumber;
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

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }
}
