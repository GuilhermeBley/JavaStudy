package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDirectoryTest {
    public static void main(String[] args) {
//        File directory = new File("folder");
//        boolean mkdir = directory.mkdir();
//        System.out.println("Diretório criado: " + mkdir);
//        //File arc = new File("C:\\Users\\Bley\\IdeaProjects\\java_studying\\folder\\arq.txt");
//        File arc = new File(directory, "arq.txt");
//        try {
//            boolean createArc = arc.createNewFile();
//            System.out.println("Arquivo criado: " + createArc);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //Renomear arquivos
//        File newArchiveName = new File(directory,"arquivo renomeado.txt");
//        boolean newarc = arc.renameTo(newArchiveName);
//        System.out.println("Renomeado: " + newarc);
//
//        //Renomear diretorios
//        File directoryRename = new File("Folder2");
//        boolean folder2 = directory.renameTo(directoryRename);
//        System.out.println("Diretorio renomeado: " + folder2);
        searchArchive();
    }

    public static void searchArchive(){
        File file = new File ("Folder2");
        String[] list = file.list();
        for (String archive : list)
            System.out.println(archive);
    }
}
