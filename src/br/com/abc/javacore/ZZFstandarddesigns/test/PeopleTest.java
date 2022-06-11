package br.com.abc.javacore.ZZFstandarddesigns.test;

import br.com.abc.javacore.ZZFstandarddesigns.clas.People;

public class PeopleTest {
    public static void main(String[] args) {
        People person = new People.PeopleBuilder("Guil")
                .name("Gui")
                .middleName("Camargo")
                .lastName("Bley")
                .nickName("Bleyzer")
                .fatherName("Arturo")
                .build();
        System.out.println(person);
    }
}
