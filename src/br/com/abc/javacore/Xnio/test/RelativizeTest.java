package br.com.abc.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/Bley");
        Path clas = Paths.get("/home/Bley/java/Person.java");
        Path pathToClasse = dir.relativize(clas); // O Relativize serve para mostrar o caminho que falta para encontrar o arquivo
        System.out.println(pathToClasse);


        Path absolute1 = Paths.get("/home/Bley");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/Bley/java/Person.Java");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/Employee.java");
        System.out.println("1 :" + absolute1.relativize(absolute3));
        System.out.println("2 :" + absolute3.relativize(absolute1));
        System.out.println("3 :" + absolute1.relativize(absolute2));
        System.out.println("4 :" + relative1.relativize(relative2));
//        System.out.println("5 :" + absolute1.relativize(relative1));

    }
}
