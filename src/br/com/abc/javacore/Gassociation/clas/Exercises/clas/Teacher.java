package br.com.abc.javacore.Gassociation.clas.Exercises.clas;

public class Teacher {
    private Seminar[] seminars;
    private String name;
    private String specialty;

    public Teacher() {
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public void print(){
        System.out.println("-------------------------Relatório de professores-------------------------");
        System.out.println("Nome do professor: " + this.name);
        System.out.println("Especialidade do professor: " + this.specialty);
        if (seminars != null && seminars.length != 0) {
            System.out.println("Seminários participantes: ");
            for (Seminar seminar : seminars) {
                System.out.println(seminar.getTitle() + " ");
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminário.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
