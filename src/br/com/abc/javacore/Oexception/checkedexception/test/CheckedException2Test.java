package br.com.abc.javacore.Oexception.checkedexception.test;

public class CheckedException2Test {
    public static void main(String[] args) {
        try{
            division(1,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Pronto");
    }

    private static void division (int num1, int num2){

        if (num2 == 0){
            throw new IllegalArgumentException("Não é possivel dividir " + num1 + " por zero");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
