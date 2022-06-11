package br.com.abc.javacore.UregularExpressions.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //Por padrão o scanner tem como delimitador o space
        Scanner scanner1 = new Scanner("1 true 100 oi");

        //hasNext NÃO muda o indice, só diz se tem algo após a delimitação
        while (scanner1.hasNext()) {
            //o next muda o indice
            System.out.println(scanner1.next());
        }


        System.out.println("**************************");
        Scanner scanner2 = new Scanner("1 ola false tudo bem 5 com voce 10000000");
        while (scanner2.hasNext()) {
            if (scanner2.hasNextInt()) {
                int i = scanner2.nextInt();
                System.out.println("Int     " + i);
            } else if (scanner2.hasNextBoolean()) {
                boolean bool = scanner2.nextBoolean();
                System.out.println("Bollean     " + bool);
            } else {
                System.out.println("Outros      " +  scanner2.next());
            }
        }
    }
}
