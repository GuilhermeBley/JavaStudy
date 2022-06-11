package br.com.abc.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class DosFileAttributesTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("Folder2\\test.txt");
        //MODIFICANDO O MODO DE LEITURA (on,off) E O MODO ESCONDIDO (on, off)
        try {
//            Files.createFile(p1);
            Files.setAttribute(p1, "dos:hidden", true);
            Files.setAttribute(p1, "dos:readonly", true);
            DosFileAttributes dos = Files.readAttributes(p1, DosFileAttributes.class);

            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());

            DosFileAttributeView dosView = Files.getFileAttributeView(p1, DosFileAttributeView.class);
//            Files.setAttribute(p1, "dos:hidden", false);
//            Files.setAttribute(p1, "dos:readonly", false);
            dosView.setHidden(false);
            dosView.setReadOnly(false);
            //Comando a baixo serve para atualizar o arquivo
            dos = Files.readAttributes(p1, DosFileAttributes.class);

            System.out.println(dos.isHidden());
            System.out.println(dos.isReadOnly());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
