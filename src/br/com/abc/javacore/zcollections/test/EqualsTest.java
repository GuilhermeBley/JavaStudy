package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Mobile;

public class EqualsTest {
    public static void main(String[] args) {
        String name1 = "GuicBley";
        String name2 = "GuicBley";
        System.out.println("String: " + (name1 == name2));

        /**
         * por conta do metodo STRING ser utilizado ele joga a palavra em um endereço de memoria,
         sendo comparado endereços e nao a palavra.
         Por este motivo é utilizado o metodo equals
         **/
        String name3 = "Ola";
        String name4 = new String("Ola");
        System.out.println("String: " + (name3 == name4));

        //Utilizando equals
        System.out.println("Equals: " + name3.equals(name4));

        Mobile c1 = new Mobile("Iphone", "12345");
        Mobile c2 = new Mobile("Iphon", "12345");
        System.out.println("Mobile: " + (c1.equals(c2)));


    }
}
