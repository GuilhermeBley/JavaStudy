package br.com.abc.javacore.Bbeginningmethods.test;

import br.com.abc.javacore.Bbeginningmethods.clas.Calculator;

public class TestParameters {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 30;
        int num2 = 20;

        calc.changeTwoValues(num1, num2);
        System.out.println("Test\nNum1 = " + num1 + "\nnum2 = " + num2 + "\n\n");

    }
}
