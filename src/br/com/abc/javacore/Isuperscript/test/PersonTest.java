package br.com.abc.javacore.Isuperscript.test;

import br.com.abc.javacore.Isuperscript.clas.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();

        p.setName("Gui Bley");
        p.setAge(11);

        p2.setName("Glauber");
        p2.setAge(21);

        System.out.println(p + "\n-----------------------\n" +  p2);
    }
}
