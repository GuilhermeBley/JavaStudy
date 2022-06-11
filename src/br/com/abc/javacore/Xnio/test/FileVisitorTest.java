package br.com.abc.javacore.Xnio.test;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class FindAllBack extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (file.getFileName().toString().endsWith(".bkp")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

class PrintDirectory extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs){
        System.out.println("Pre: " + dir);
        if (dir.getFileName().toString().equals("Subpasta")) {
            System.out.println("FIM: " + dir);
//            return FileVisitResult.TERMINATE; Parar busca ou contimuar
            //Comando usado para ignorar todos os arquivos dentro dessa pasta
            return FileVisitResult.SKIP_SUBTREE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println("file: " + file.getFileName());
        return FileVisitResult.CONTINUE;

    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc){
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("post: " + dir);
        return FileVisitResult.CONTINUE;
    }

}



public class FileVisitorTest {
    public static void main(String[] args) throws IOException {
        Files.walkFileTree(Paths.get("Pasta"), new PrintDirectory());
    }
}
