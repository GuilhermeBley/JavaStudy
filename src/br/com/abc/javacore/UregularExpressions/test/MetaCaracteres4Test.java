package br.com.abc.javacore.UregularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteres4Test {
    //CARACTER DE NEGAÇÃO "^"
    public static void main(String[] args) {
        String regex = "proj([^,])+",
                text = "proj1.bkp, proj1.java, proj1.class, proj1Final.java, proj2.bkp, proj3.java, diagram, text, photos";

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
