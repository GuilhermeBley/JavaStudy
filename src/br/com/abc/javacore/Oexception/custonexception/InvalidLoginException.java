package br.com.abc.javacore.Oexception.custonexception;

public class InvalidLoginException extends Exception{

    public InvalidLoginException(){
        super("Usuário ou senha inválido");
    }
}
