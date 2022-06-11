package br.com.abc.javacore.Sstring.test;

public class StringFormsTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatString(30000);
        long end = System.currentTimeMillis();
        System.out.println("Tempo gasto " + (end - start) + " ms");

        long startBuilder = System.currentTimeMillis();
        concatStringBuilder(1000000);
        long endBuilder = System.currentTimeMillis();
        System.out.println("Tempo gasto String Buider " + (endBuilder - startBuilder) + " ms");

        long startBuffer = System.currentTimeMillis();
        concatStringBuffer(1000000);
        long endBuffer = System.currentTimeMillis();
        System.out.println("Tempo gasto String Buffer " + (endBuffer - startBuffer) + " ms");
    }

    private static void concatString (int size){
        String string = "";
        for (int index = 0; index < size; index++)
            string += index;
    }

    private static void concatStringBuilder (int size){
        StringBuilder string = new StringBuilder();
        for (int index = 0; index < size; index++)
            string.append(index);
    }

    private static void concatStringBuffer (int size){
        StringBuffer string = new StringBuffer();
        for (int index = 0; index < size; index++)
            string.append(index);
    }
}
