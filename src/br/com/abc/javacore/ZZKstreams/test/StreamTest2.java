package br.com.abc.javacore.ZZKstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest2 {
    public static void main(String[] args) {
        List<List<String>> names = new ArrayList<>();
        names.add(asList("Ola", "Tudo bem"));
        names.add(asList("Me chamo", "Guilherme"));
        Stream<String> stringStream = names.stream().flatMap(Collection::stream);
        stringStream.forEach(System.out::println);
        System.out.println(names);

        //Extraindo valores
        List<String> collect = names.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);


        //Separando palavras tradicionalmente
        List<String> words = asList("Ola", "TudoBem");
        String[] split = words.get(0).split("");
        System.out.println(Arrays.toString(split));

        //Com Stream
//        List<Stream<String>> collect1 = words.stream().map(p -> Arrays.stream(p.split(""))).collect(Collectors.toList());
        List<String> collect1 = words.stream() //Stream<String>
                .map(p -> p.split("")) //Stream<String[]>
                .flatMap(Arrays::stream) //Stream<String>
                .collect(Collectors.toList());

        System.out.println(collect1);
    }

}
