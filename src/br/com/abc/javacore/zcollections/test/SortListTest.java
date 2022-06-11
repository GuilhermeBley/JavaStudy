package br.com.abc.javacore.zcollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Guilherme");
        names.add("Bley");
        names.add("Tabata");
        names.add("Lucas");
        names.add("Cleonice");
        names.add(0, "Julio");

        List<Double> numbers = new ArrayList<>();
        numbers.add(1123.2);
        numbers.add(92319.21);
        numbers.add(123.213124);
        numbers.add(123415312.213);

        //Organiza em ordem alfabética ou numérica
        Collections.sort(names);
        Collections.sort(numbers);

        System.out.println("----------NOMES----------");
        for (String name: names)
            System.out.println(name);

        System.out.println("----------NUMEROS----------");
        for (Double num : numbers)
            System.out.println(num);

    }
}
