package br.com.abc.javacore.Abeginningclass.test;

import br.com.abc.javacore.Abeginningclass.clas.Teatcher;

public class TeatcherTest {
    public static void main(String[] args) {
        Teatcher teatcher = new Teatcher();

        teatcher.name = "Guilherme Bley";
        teatcher.registration = "123125";
        teatcher.rg = "5678213681";
        teatcher.cpf = "4701283172";

        System.out.println("Nome: "+teatcher.name+"\nMatricula: "+ teatcher.registration +"\nRG: "+ teatcher.rg+ "\nCPF: "+ teatcher.cpf);

    }
}
