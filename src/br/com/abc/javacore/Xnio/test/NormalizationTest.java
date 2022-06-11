package br.com.abc.javacore.Xnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizationTest {
    public static void main(String[] args) {
        String programDirectory = "java_studying\\Home\\Bley\\dev";
        String archiveTxt = "..\\..\\arq.txt";
        Path p1 = Paths.get(programDirectory,archiveTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        System.out.println("++++++++++++++++++++");

        Path p2 = Paths.get("home/./Bley/./dev");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}
