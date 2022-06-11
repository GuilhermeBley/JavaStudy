package br.com.abc.javacore.Oexception.reader.clas;

public class Readers2 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Leitor 2");
    }
}
