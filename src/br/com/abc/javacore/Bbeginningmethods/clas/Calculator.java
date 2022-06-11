package br.com.abc.javacore.Bbeginningmethods.clas;

public class Calculator {
    public void sumTwoNumbers(){
        System.out.println("Adição: ");
        System.out.println(5+6);
    }
    public void subTwoNumbers(){
        System.out.println("Subtração: ");
        System.out.println(5-4);
    }
    public void multiTwoNumbers(int num1, byte num2){
        System.out.print("Multiplicação:\n" + num1*num2);
    }

    public double diviTwoNumbers(double num1, double num2){
        System.out.println("\ndivisão:");
        if (num2 != 0) return num1/num2;
        System.out.println("Valor inválido.");
        return 0;
    }

    public double printTwoNumbersDiv(double num1 , double num2){
        System.out.println("\n\nValor impresso: ");
        if (num2 != 0){
            return num1/num2;
        }
        System.out.println("Valor inválido");
        return num1;
    }

    public void changeTwoValues(int num1, int num2){
        num1 = 39;
        num2 = 48;

        System.out.println("CHANGE\nNum1 = " + num1 + "\nnum2 = " + num2 + "\n\n");
    }

//    public void arrayNumbers(int [] numbers){
 //       int soma = 0;
//        for (int num : numbers){
//            soma += num;
//        }
//        System.out.println("array: " + soma);
//    }
// Comando acima substituido pelo VarArgs, que serve também como um array.

    public void arrayVarNumbers (int... numbers){
        int soma = 0;
        for (int num : numbers){
            soma += num;
        }
        System.out.println(soma);
    }

}
