package br.com.abc.javacore.Bbeginningmethods.test;

import br.com.abc.javacore.Bbeginningmethods.clas.Ex1Student;

public class Ex1testStudent {
    public static void main(String[] args) {

        Ex1Student student = new Ex1Student();

        student.setName("Douglas Aparecido");
        student.setAge(0);
        student.setGrades(new double []{10,6,5});

        student.printInformation();
        System.out.println("aprovado: " + student.isApproved());

    //    System.out.println("nome: " + student.getName() + "\nidade: " + student.getAge() + student.getGrades());


    }
}
