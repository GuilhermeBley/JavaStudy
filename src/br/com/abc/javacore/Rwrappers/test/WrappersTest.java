package br.com.abc.javacore.Rwrappers.test;

public class WrappersTest {
    public static void main(String[] args) {

        //TIPOS PRIMITIVOS DE VARIAVEIS, SÃO 8
        //sem ponto flutuante
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 1;
        long longPrimitivo = 10L;

        //com ponto flutuante
        float floatPrimitivo = 10F;
        double doublePrimitivo = 10D;

        //não números
        char charPrimitivo = 'a';
        boolean bollPrimitivo = true;

        //Primitivos WRAPPERS
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer intWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = 10F;
        Double doubleWrapper = 10D;
        Character charWrapper = 'A';
        Boolean bollWrapper = true;

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.toUpperCase('a'));
    }
}
