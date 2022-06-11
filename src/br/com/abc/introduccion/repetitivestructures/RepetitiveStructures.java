package br.com.abc.introduccion.repetitivestructures;

public class RepetitiveStructures {
    public static void main(String[] args) {

        int contator = 11;

        while (contator < 10) {

            System.out.println(++contator);
        }



        do {

            System.out.println("DoWhile executing, number contator is: " + contator);
        } while (contator < 10);



        for (int i=0; i<10 ; i++){
            System.out.println("The value of 'i' is: " + i);
            break;
        }
    }
}
