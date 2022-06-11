package br.com.abc.javacore.Oexception.error.Test;

public class ErrorTest {
    public static void main(String[] args) {
        stackOverflowError();
    }

    public static void stackOverflowError(){
        if (1 == 1)
            stackOverflowError();
    }

}


