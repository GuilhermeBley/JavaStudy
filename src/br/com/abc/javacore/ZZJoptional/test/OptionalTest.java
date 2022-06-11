package br.com.abc.javacore.ZZJoptional.test;

import java.util.Optional;

public class OptionalTest {
    private String name;
    public static void main(String[] args) {
        OptionalTest ot = new OptionalTest();
        if(!(ot.name == null))
            System.out.println(ot.name.toUpperCase());

        Optional<String> optional = Optional.of("GuiBLey");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(ot.name);
//        System.out.println(ot.name.toUpperCase());
        System.out.println(optional);
        System.out.println(optional2);
        System.out.println(optional3);

        System.out.println(optional.orElse("Vazio"));
        System.out.println(optional2.orElse("Vazio"));
        System.out.println(optional3.orElse("Vazio"));
    }
}
