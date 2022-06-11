package br.com.abc.javacore.ZZAgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {
    public static void main(String[] args) {
        createArray(new Dog());
    }

    public static <T extends Animal> void createArray(T t){

        List<T> list = new ArrayList<>();
        list.add(t);


    }
}
