package br.com.abc.javacore.Abeginningclass.test;

import br.com.abc.javacore.Abeginningclass.clas.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student joao = new Student();
        joao.name = "João";
        joao.registration = "283";
        joao.age = 15;

        System.out.println(joao.name + "\n" + joao.registration + "\n" +joao.age);
    }
}
