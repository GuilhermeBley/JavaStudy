package br.com.abc.javacore.UregularExpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetaCaracteresTest {
    public static void main(String[] args) {
        /**

         * \d = Busca todas as posições que contem digitos
         * \D = Busca todas as posições que não contem digitos
         * \s = Espaços em branco
         * \S = Tudo que não é espaço em branco
         * \w = caracteres de a-z A-z, Digitos e _
         * \W = Tudo o que não for um caractere de palavra
         * [] = Utilizado na busca, serve para encontrar qualquer uma das letras inseridas dentro dos colchetes

         *QUANTIFICADORES
         *  ? zero ou uma
         *  * zero ou mais
         *  + uma ou mais
         *  {n,m} de N até M
         *  ( ) agrupar
         *  | ou
         *  $ fim
         *  o(v|c)o = ovo, oco;
         *  . coringa 1.3 = 123, 133, 1A3, 1s3, 1 3;
         *
         *  CARACTER DE NEGAÇÃO '^'

         */
//        int numHex = 0x23;

        //Pega todos os valores que comecem com "0" e X ou x, seguidos de um ou mais caracteres de 0 à 9 ou "A" até "F",
        // tanto minusculo como maiusculo, com o final delimitado por um espaço (\\s) ou fim de linha ($)

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)", text = "12 0X 0x 0xFFABC 0x10G 0x1 ";

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
