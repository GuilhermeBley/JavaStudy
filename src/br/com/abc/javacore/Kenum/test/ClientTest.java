package br.com.abc.javacore.Kenum.test;

import br.com.abc.javacore.Kenum.clas.Client;
import br.com.abc.javacore.Kenum.clas.TypeClient;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Kaleb", TypeClient.PESSOA_FISICA, Client.TypePayment.CASH);
        System.out.println(TypeClient.PESSOA_JURIDICA.getId());
        System.out.println(TypeClient.PESSOA_FISICA.getId());
        System.out.println(client);
    }
}
