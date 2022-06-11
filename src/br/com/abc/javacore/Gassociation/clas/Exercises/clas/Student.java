package br.com.abc.javacore.Gassociation.clas.Exercises.clas;

public class Student {
    private Seminar seminar;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print(){
        System.out.println("-------------------------Relatório de alunos-------------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("idade: " + this.age);
        if (this.seminar != null) {
            System.out.println("Seminario inscrição: " + this.seminar.getTitle());
            return;
        }
        System.out.println("Aluno não esta inscrito em nenhum seminário.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
