package br.com.abc.javacore.Wio.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipTest {
    public static void main(String[] args) {
        ZippingBuffer();
    }

    private static void Zipping(){
        Path dirZip = Paths.get("pasta/subpasta");
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        //Salvando Zip em "pasta/subpasta" logo abaixo
        Path zipName = dirZip.resolve("archive.zip");

        //O stream retorna todos os arquivos que estão na pasta
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipName.toFile()));
             DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
            for (Path path : stream){
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zip.putNextEntry(zipEntry);
                FileInputStream fileInputStream = new FileInputStream(path.toFile());

                byte[] buff = new byte[2048];
                int byteRead;
                while((byteRead = fileInputStream.read(buff)) > 0){
                    zip.write(buff,0,byteRead);
                }
                //Alguns arquivos não puderam ser fechados por não estarem no TryWithResources, e para não poluir o código ele foi fechado por fora
                zip.closeEntry();
                fileInputStream.close();
            }
            System.out.println("Zip Criado com sucesso! (Processo File)");


        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void ZippingBuffer(){
        Path dirZip = Paths.get("pasta/subpasta");
        Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
        Path zipName = dirZip.resolve("archive.zip");

        //O stream retorna todos os arquivos que estão na pasta
        try (ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipName.toFile()));
             DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){
            for (Path path : stream){
                zip.putNextEntry(new ZipEntry(path.getFileName().toString()));

                                //BUFFER ADICIONADO
                BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));

                byte[] buff = new byte[2048];
                int byteRead;
                while((byteRead = bf.read(buff)) > 0){
                    zip.write(buff,0,byteRead);
                }
                //Alguns arquivos não puderam ser fechados por não estarem no TryWithResources, e para não poluir o código ele foi fechado por fora
                zip.flush();
                zip.closeEntry();
                bf.close();
            }
        System.out.println("Zip Criado com sucesso! (Processo Buffer)");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
