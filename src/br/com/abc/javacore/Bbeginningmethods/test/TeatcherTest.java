package br.com.abc.javacore.Bbeginningmethods.test;

import br.com.abc.javacore.Bbeginningmethods.clas.Teatcher;

public class TeatcherTest {
    public static void main(String[] args) {
        Teatcher teatcher = new Teatcher();
        Teatcher teatcher2 = new Teatcher();

        teatcher.name = "Hugo Hess";
        teatcher.cpf = "129.123.123.17";
        teatcher.registration = "1234";
        teatcher.rg = "123.213.867.7";

        teatcher2.name = "Marcos";
        teatcher2.cpf = "156.342.623.77";
        teatcher2.registration = "7457";
        teatcher2.rg = "432.345.865.6";



        teatcher.printValues();
        System.out.print("\n\n");
        teatcher2.printValues();
    }


}
