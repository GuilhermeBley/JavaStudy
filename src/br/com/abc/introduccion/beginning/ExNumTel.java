package br.com.abc.introduccion.beginning;

import java.io.IOException;
import java.util.Scanner;

public class ExNumTel {
    public static void main (String [] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int numberTel;
        String namePerson;
        String address;
        char gender;
        int year;
        String maritalStatus;


        System.out.println("Escreva seu nome: ");
        namePerson = ler.nextLine();

        System.out.println("Escreva seu endereço: ");
        address = ler.nextLine();

        System.out.println("Escreva seu número de telefone: ");
        numberTel = ler.nextInt();

        System.out.println("Escreva seu sexo, 'm' ou 'f'. ");
        gender = (char)System.in.read();

        System.out.println("Escreva sua idade em anos: ");
        year = ler.nextInt();

        System.out.println("Escreva seu estado civil: ");
        maritalStatus = ler.next();

        System.out.println("\n\n\nSeu nome é: "+namePerson + "\n O endereço é: "+address + "\nSeu número: " + numberTel + "\nSeu sexo é: " + gender + "\nSua idade é: " + year + "\nE seu estado civil: " + maritalStatus);

    }
}
