package br.com.abc.javacore.Wio.test;

import java.io.*;

public class StramsTest {
    public static void main(String[] args) {
        readerBuffer();
    }

    private static void recorder(){
        byte[] data = {65, 66, 67, 68, 69, 70};
        try (FileOutputStream recorder = new FileOutputStream("pasta/stream.txt")){
            recorder.write(data);
            System.out.println("Dados gravados com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void recorderBuffer(){
    //  Metodo mais longo para criar o buffer
//        FileOutputStream recorder = new FileOutputStream("pasta/stream.txt");
//        BufferedOutputStream bf = new BufferedOutputStream(recorder);
        byte[] data = {65, 66, 67, 68, 69, 70};
        try (BufferedOutputStream recorder = new BufferedOutputStream (new FileOutputStream("pasta/stream.txt"))){
            recorder.write(data);
            recorder.flush();
            System.out.println("Dados gravados com sucesso");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void reader(){
        try(FileInputStream reader = new FileInputStream("pasta/stream.txt")){
            int numReader;
            while ((numReader = reader.read()) != -1){
                byte b = (byte) numReader;
                System.out.println(" " + b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readerBuffer(){
        try(BufferedInputStream reader = new BufferedInputStream(new FileInputStream("pasta/stream.txt"))){
            int numReader;
            while ((numReader = reader.read()) != -1){
                byte b = (byte) numReader;
                System.out.println(" " + b);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
