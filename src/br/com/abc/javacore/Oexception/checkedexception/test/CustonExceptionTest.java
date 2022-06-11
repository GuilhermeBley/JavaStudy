package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.custonexception.InvalidLoginException;

import javax.security.auth.login.LoginException;

public class CustonExceptionTest {
    public static void main(String[] args) {

    }

    private static void logar() throws InvalidLoginException {
        String user = "Goku", password = "123";
        String userType = "Goku", passwordType = "321";

        if ( !(user.equals(userType)) || !(password.equals(passwordType)) ){
            throw new InvalidLoginException();
        }else{
            System.out.println("Login inválido");
        }


    }
}
