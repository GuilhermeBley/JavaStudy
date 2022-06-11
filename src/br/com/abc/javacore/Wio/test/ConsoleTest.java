package br.com.abc.javacore.Wio.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();
        char[] pw = console.readPassword("%s", "pw: ");
        for(char pass : pw)
            console.format("%c", pass);

        console.format("\n");

        String text;
        while(true){
            text = console.readLine("%s","Digite: ");
            console.format("Esse texti %s foi digitado", returning(text));
        }

    }

    public static String returning(String arg1){
        return "Entradad de dados: " + arg1;
    }
}
