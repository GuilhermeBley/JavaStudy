package br.com.abc.introduccion.operators;

public class LogicalOperators {
    public static void main (String [] args){
        //&& and || or

        float salary = 10000f;
        int age = 10;

        System.out.println(age >= 10 && salary == 1000);

        //false

        System.out.println(age >= 10 || salary == 1000);

        //true
    }
}
