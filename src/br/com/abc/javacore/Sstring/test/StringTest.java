package br.com.abc.javacore.Sstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Mirna";
        //String sobreNome = new String("Urso");

//        nome += " Urso";

//        nome.concat(" Urso"); Modo incorreto, o valor concatenado não esta sendo jogado para nenhuma variavel
        nome = nome.concat(" Urso");

        String nome2 = new String("Carolina");// Criando 1 Variavel de retorno, 1 objeto do tipo String e uma STring no pool de string

//        System.out.println(nome);

        String teste = "Goku";
        String teste2 = "   0123456789 ";

        System.out.println(teste.charAt(0));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('o','a'));
        System.out.println(teste2.substring(0,1));
        //tira os espaços
        System.out.println(teste2.trim());
    }
}
