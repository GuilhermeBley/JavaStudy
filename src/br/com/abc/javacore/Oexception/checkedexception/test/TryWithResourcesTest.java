package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        readArchive();
    }

    /**
     * Após o lançamento do Java 7 este método foi atualizado.


    public void lerArquivo(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

     **/

    public static void readArchive(){
        try (Reader reader = new BufferedReader(new FileReader("Text.txt")) ){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
