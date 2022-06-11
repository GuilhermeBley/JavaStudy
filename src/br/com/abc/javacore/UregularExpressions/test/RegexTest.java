package br.com.abc.javacore.UregularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    //Regular Expressions = REGEX
    public static void main(String[] args) {
        //Padrão string criado
        String regex = "ab", text = "ababbabaaabbssw";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto: " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posiçoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " ");
        }
    }
}
