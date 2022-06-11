package br.com.abc.javacore.Oexception.runTimeException.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultipleRunTimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }
        
        try{
            perhaps();
        } catch (SQLException | IOException e){

        } //catch (Exception e)

    }


    private static void perhaps() throws SQLException, IOException {//, AWTException {

    }
}
