package br.com.abc.javacore.Xnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BasicAttributesTest {
    public static void main(String[] args) throws IOException {
        Date oneDecember = new GregorianCalendar(2015, Calendar.DECEMBER, 1).getTime();

        System.out.println("--------File--------");
        //COM FILES
        File file = new File("Folder2\\archive.txt");

        file.createNewFile();
        file.setLastModified(oneDecember.getTime());
        System.out.println(file.lastModified());
        file.delete();


        System.out.println("--------Path--------");
        //COM PATHS
        Path path = Paths.get("Folder2\\archive path.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.fromMillis(oneDecember.getTime());
        Files.setLastModifiedTime(path, fileTime);
        System.out.println(Files.getLastModifiedTime(path));
        Files.deleteIfExists(path);

        System.out.println("+++++++++++PathCard+++++++++++");
        path = Paths.get("src\\br\\com\\abc\\javacore\\Abeginningclass\\test\\CardTest.java");
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isWritable(path));
        System.out.println(Files.isExecutable(path));

        //BasicFileAttributes, PosixFileAttributes, DosFileAttributes
        System.out.println("--------BasicFileAttributes--------");
        BasicFileAttributes basicAtt = Files.readAttributes(path,BasicFileAttributes.class);
        System.out.println("Created: " + basicAtt.creationTime());
        System.out.println("Last acess: " + basicAtt.lastAccessTime());
        System.out.println("Last modification: " + basicAtt.lastModifiedTime());
        System.out.println(basicAtt.isDirectory());
        System.out.println(basicAtt.isSymbolicLink());
        System.out.println(basicAtt.isRegularFile());


        //BasicFileAttributesView, PosixFileAttributesView, DosFileAttributesView, FileOwnerAttributeView, AclFileAttributeView

        FileTime lastModified = basicAtt.lastModifiedTime();
        FileTime created = basicAtt.creationTime();
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());

        BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        basicView.setTimes(lastModified, lastAcess, created);
        //O comando abaixo é colocado para a leitura do arquivo, ja que nao havera modificação caso não haja atualizações nele
        basicAtt = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Created: " + basicAtt.creationTime());
        System.out.println("Last acess: " + basicAtt.lastAccessTime());
        System.out.println("Last modification: " + basicAtt.lastModifiedTime());

    }
}
