package br.com.abc.introduccion.operators;

public class Operators {
    public static void main (String [] args){
        int numberOne = 10;
        int numberTwo = 20;

        System.out.println(numberOne+numberTwo + "   O numero é   " + numberOne+numberTwo + "\n" +(numberOne+numberTwo));
        System.out.println("A divisao é " + numberOne/numberTwo);

        int rest = numberOne % numberTwo;

        System.out.println("O resto da operação é: " + rest);
    }
}
