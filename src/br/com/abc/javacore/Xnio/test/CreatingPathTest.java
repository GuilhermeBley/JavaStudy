package br.com.abc.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CreatingPathTest {
    public static void main(String[] args) {
        //Modelos de criação de Path
//        Path p1 = Paths.get("C:\\Users\\Bley\\IdeaProjects\\java_studying\\Arquivo.txt");
//        Path p2 = Paths.get("C:\\Users\\Bley\\IdeaProjects\\java_studying", "Arquivo.txt");
        Path p3 = Paths.get("C:" , "Users" , "Bley" , "IdeaProjects" , "java_studying", "Arquivo.txt");
        System.out.println(p3.toAbsolutePath());

        //Criação de Diretório (Um)

        Path path1 = Paths.get("pasta");
        try {
            if(Files.notExists(path1))
                Files.createDirectory(path1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Criação de Diretórios (Dois ou mais)
        Path path2 = Paths.get("Paste\\Test\\TestDirectory");
        Path archivePath = Paths.get("Paste\\Test\\TestDirectory\\Testing.txt");
        try {
            if(Files.notExists(path2))
                Files.createDirectories(path2);
            if (Files.notExists(archivePath))
            Files.createFile(archivePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //COPY and Paste

        Path source = Paths.get("Folder2\\arquivo renomeado.txt");
        Path target = Paths.get(path2.toString() + "\\ArquivoCopiado.txt");

        try {
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
