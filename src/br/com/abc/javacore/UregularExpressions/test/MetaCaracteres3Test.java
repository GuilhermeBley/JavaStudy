package br.com.abc.javacore.UregularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteres3Test {
    public static void main(String[] args) {
        String regex = "\\d{2}/" +//  dd/
                "\\d{2}/"+ //  MM/
                "\\d{2,4}", //   yyyy
                text = "05/10/2010 05/5/2015 1/1/01 01/05/95 "; //dd/MM/yyyy

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto: " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posiçoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
