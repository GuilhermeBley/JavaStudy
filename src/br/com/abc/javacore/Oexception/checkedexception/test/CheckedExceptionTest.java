package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            createArchive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createArchive() throws IOException {
        File file = new File("Test.txt");
        //Caso tente criar um arquivo que não exista é um dos erros do tipo CHECKED
        //file.createNewFile()

        try{
            file.createNewFile();
            System.out.println("Arquivo Criado: " + file.createNewFile());
        } catch (IOException e){
            System.out.println("Não foi possível criar o arquivo");
            e.printStackTrace();
            throw e;
        }
    }
}
