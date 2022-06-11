package br.com.abc.javacore.Oexception.reader.test;

import br.com.abc.javacore.Oexception.reader.clas.Readers1;
import br.com.abc.javacore.Oexception.reader.clas.Readers2;

public class ReaderTest {
    public static void main(String[] args) {
        try(Readers1 readers1 = new Readers1();
            Readers2 readers2 = new Readers2()){

        }catch (Exception e){

        }
    }
}
