package br.com.abc.javacore.Fstaticmodificator.test;

import br.com.abc.javacore.Fstaticmodificator.classes.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client();
        Client client2 = new Client();
        Client client3 = new Client();
        System.out.println("Exibindo a quantia de parcelas possíveis: ");
        System.out.println("Tamanho: " +client.getPortion().length);
        System.out.println("Tamanho: " +client2.getPortion().length);
        System.out.println("Tamanho: " +client3.getPortion().length);
    }
}
