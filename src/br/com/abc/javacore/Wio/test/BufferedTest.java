package br.com.abc.javacore.Wio.test;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args){

        File file = new File("Arquivo.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))){
            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine(); //Modelo mais eficaz para se pular linha (funciona em todos sistemas)
            bw.write("E pulando uma linha");
            bw.flush();
            bw.close();


            //METODO DE LEITURA COM BUFFERREADER

            //LÊ Linha por linha, quando a linha não houver nada é parado o processo
            String s;
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

/** Esse modelo tem a necessidade de fechar
        try {
            FileWriter fw = new FileWriter(file, false); //Metodo de sobrescrita vem como padrão ativada (false)
            BufferedWriter bw = new BufferedWriter(fw);


            //METODO DE ESCRITA COM O BUFFEREDWRITER
            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine(); //Modelo mais eficaz para se pular linha (funciona em todos sistemas)
            bw.write("E pulando uma linha");
            bw.flush();
            bw.close();


            //METODO DE LEITURA COM BUFFERREADER
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            //LÊ Linha por linha, quando a linha não houver nada é parado o processo
            String s = null;
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    **/
    }
}
