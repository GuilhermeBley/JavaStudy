package br.com.abc.javacore.Gassociation.clas.Exercises.test;

import br.com.abc.javacore.Gassociation.clas.Exercises.clas.Local;
import br.com.abc.javacore.Gassociation.clas.Exercises.clas.Seminar;
import br.com.abc.javacore.Gassociation.clas.Exercises.clas.Student;
import br.com.abc.javacore.Gassociation.clas.Exercises.clas.Teacher;

import java.security.AlgorithmConstraints;

public class TestSeminar {
    public static void main(String[] args) {
        Student student = new Student("Guilherme", 18);
        Student student2 = new Student("Gilbert", 20);

        Seminar seminar = new Seminar("O jogo");
        Teacher teacher = new Teacher("Wilson roberto", "Português");
        Local local = new Local("23", "Ciriaco");

        //student.setSeminar(seminar) serve para passar os valores do seminario para o aluno.
        student.setSeminar(seminar);
        student2.setSeminar(seminar);

        seminar.setTeacher(teacher);
        seminar.setLocal(local);
        seminar.setPupils(new Student[]{student,student2});

        Seminar[] semArray = new Seminar[1];
        semArray[0] = seminar;
        teacher.setSeminars(semArray);

        seminar.print();
        teacher.print();
    }
}
