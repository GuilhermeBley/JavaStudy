package br.com.abc.javacore.Gassociation.clas.Exercises.clas;

public class Seminar {
    private Student[] pupils;
    private Local local;
    private Teacher teacher;
    private String Title;

    public Seminar() {
    }

    public Seminar(String title) {
        Title = title;
    }

    public void print(){
        System.out.println("-------------------------Relatório de seminário-------------------------");
        System.out.println("Titulo: "+ this.Title);

        if (this.teacher != null)
            System.out.println("Professor palestrante " + this.teacher.getName());
        else
            System.out.println("Nenhum professor vinculado para esse seminário");

        if (this.local != null)
            System.out.println("Local, rua: " + this.local.getStreet() + " Bairro: " + this.local.getNeighborhood());
        else
            System.out.println("Nenhum local vinculado para esse seminário");

        if (pupils != null && pupils.length != 0 ) {
            System.out.println("Alunos participantes: ");
            for (Student student : pupils) {
                System.out.println(student.getName());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Student[] getPupils() {
        return pupils;
    }

    public void setPupils(Student[] pupils) {
        this.pupils = pupils;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
