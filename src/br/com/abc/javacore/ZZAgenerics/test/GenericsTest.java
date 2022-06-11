package br.com.abc.javacore.ZZAgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Ola");
        System.out.println(list);
    }
}
