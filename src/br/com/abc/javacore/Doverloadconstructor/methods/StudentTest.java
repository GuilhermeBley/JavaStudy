package br.com.abc.javacore.Doverloadconstructor.methods;

import br.com.abc.javacore.Doverloadconstructor.clas.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("12831", "Guilherme Bley", new double[]{1,5,7}, "29/06/20");
        student.print();
    }
}
