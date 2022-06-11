package br.com.abc.javacore.Bbeginningmethods.test;

import br.com.abc.javacore.Bbeginningmethods.clas.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sumTwoNumbers();
        calc.subTwoNumbers();
        calc.multiTwoNumbers(2,(byte)50);


        //        System.out.println(calc.diviTwoNumbers(32,5)); ou
        double result = calc.diviTwoNumbers(32,0);
        System.out.print(result);

        calc.printTwoNumbersDiv(0, 0);

        System.out.println("\n\nContinuando Execução");


        int [] numbers = new int []{1,23,21,213,5423};
        //calc.arrayVarNumbers(numbers); OU
        calc.arrayVarNumbers(1,2,3,5453,32423,5623,1234,5234,523);

    }
}
