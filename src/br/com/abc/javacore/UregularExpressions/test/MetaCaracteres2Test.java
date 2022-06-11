package br.com.abc.javacore.UregularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteres2Test {
    public static void main(String[] args) {
        String regex = "([\\w\\._-])+" + //Verifica antes do '@'
                "@([a-zA-Z])+" + //Verifica se tem o '@' e após o '@'
                "(\\.([a-zA-Z])+){1,3}", //Verifica se tem o ponto e se tem algo após o ponto
                text = "goku@gmail.com, 102Abc@gmail.com, #@!abraomail, teste@gmail.br, test@mail, test@mail.com.br";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        System.out.println("Texto: " + text);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressão: " + matcher.pattern());
        System.out.println("Posiçoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }

        //VALIDANDO
        System.out.println("Email valido? " + "#@!abraomail".matches(regex));
    }
}
