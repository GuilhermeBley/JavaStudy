package br.com.abc.javacore.Wio.test;

import java.io.*;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");

        try (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {

            fw.write("Escrevendo uma mensagem no arquivo\nE pulando linha 2");
            fw.flush();

            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho " + size);
            for (char c : in)
                System.out.print(c);

        } catch (IOException e) {
            e.printStackTrace();
        }


//        try {
//            FileWriter fw = new FileWriter(file, false); //Metodo de sobrescrita vem como padrão ativada (false)
//            fw.write("Escrevendo uma mensagem no arquivo\nE pulando linha 2");
//            fw.flush();
//            fw.close();
//
//            FileReader fr = new FileReader(file);
//            char[] in = new char[500];
//            int size = fr.read(in);
//            System.out.println("Tamanho " + size);
//            for (char c : in)
//                System.out.print(c);
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
