package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FilesTest {
    public static void main(String[] args) {
        File file = new File("Text.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            //Saber se o arq existe
            file.exists();
            //Delet
            file.delete();
            //Permicao de leitura
            file.canRead();
            //Saber o path
            System.out.println(file.getPath());
            //Saber se é um diretorio
            file.isDirectory();
            //Ultima modificação
            System.out.println("Last modified " + new Date(file.lastModified()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
