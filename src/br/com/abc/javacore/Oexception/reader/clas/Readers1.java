package br.com.abc.javacore.Oexception.reader.clas;

public class Readers1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Leitor 1");
    }
}
