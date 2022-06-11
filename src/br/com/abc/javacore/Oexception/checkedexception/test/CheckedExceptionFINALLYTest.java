package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionFINALLYTest {
    public static void main(String[] args) {
        try {
            openArchive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openArchive() throws IOException {
        File file = new File("Test.txt");

        try{

            System.out.println("Abrindo arquivo");
            System.out.println("Executando a leitura");

        /**Invés de colocar no try, onde pode ocorrer um erro e não executar uma linha
         * é posto no Finally, onde sempre o código será executado**/

            //            System.out.println("Fechar o arquivo");

            //throw new Exception();
        /**Comando a baixo nunca sera executado, colocar no bloco catch pois o throw new Exeption o chamou**/

            System.out.println("Escrevendo o arquivo");
        } catch (Exception e){
            System.out.println("Escrevendo o arquivo");
            e.printStackTrace();
        } finally {
            System.out.println("Fechar arquivo");
        }
    }
}
