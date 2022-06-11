package br.com.abc.javacore.Xnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTest extends  SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{test*}.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file))
            System.out.println(file.getFileName());
    return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("pasta/subpasta/subsubpasta/file.bkp");
        Path p2 = Paths.get("file.bkp");
        Path p3 = Paths.get("Tha-tubaina");
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.bkp");

        System.out.println(matcher.matches(p1));
        System.out.println(matcher.matches(p2));
        System.out.println("-------------------------------");
        //Sistema de busca pelo visando o tipo de arquivo
        matches(p1, "glob:*.bkp");
        matches(p1, "glob:**/*.bkp");
        matches(p1, "glob:*");
        matches(p1, "glob:**");

        System.out.println("-------------------------------");
        //Procurar com 3 tres caracteres
        matches(p1, "glob:*.???");
        matches(p1, "glob:**/*.???");
        matches(p1, "glob:**.???");

        System.out.println("-------------------------------");
        matches(p3, "glob:{Tha*,tubaina*}");
        matches(p3, "glob:{Tha,tubaina}*");
        matches(p3, "glob:{Tha,tubaina}");

        Files.walkFileTree(Paths.get("./"), new FindAllTest());
    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}


