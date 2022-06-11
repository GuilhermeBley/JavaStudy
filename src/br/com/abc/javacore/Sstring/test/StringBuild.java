package br.com.abc.javacore.Sstring.test;

public class StringBuild {
    public static void main(String[] args) {
        String s = "Recebe uma frase comum";
        StringBuilder stringBuilder = new StringBuilder(16);
        stringBuilder.append("Uma frase comum");
        System.out.println(stringBuilder.reverse());

        String copy = stringBuilder.toString();
        System.out.println(copy);

        StringBuilder stringBuilder1 = new StringBuilder(16);
        stringBuilder1.append("0123456789");
        stringBuilder1 = stringBuilder1.delete(0,2);
        System.out.println(stringBuilder1);

    }
}
