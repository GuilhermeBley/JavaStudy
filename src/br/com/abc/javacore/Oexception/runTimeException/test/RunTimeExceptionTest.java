package br.com.abc.javacore.Oexception.runTimeException.test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        if (b != 0)
            c = a / b;
//        System.out.println(c);
//      Caso não haja o IF sera ocasionado um erro Lógico (Unchecked) RunTimeException

//        int [] array= new int [2];
//        System.out.println(array[2]);
//        Erro do tipo Unchecked, ArrayIndexOutOfBoundsException


        try{
            int [] array = new int [2];
            System.out.println(array[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        System.out.println("Ola");
    }
}
