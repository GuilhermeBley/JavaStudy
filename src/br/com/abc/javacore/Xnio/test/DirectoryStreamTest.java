package br.com.abc.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    public static void main(String[] args) {
        Path dir = Paths.get("Pasta");
        //Todas as classes Streams tem que se fechar o arquivo
//        Por conta disso é mais esse método do try (TryWithResources)
//        onde ele fecha automaticamente
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
//            for()

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
