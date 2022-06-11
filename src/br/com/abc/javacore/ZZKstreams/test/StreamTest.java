package br.com.abc.javacore.ZZKstreams.test;

import br.com.abc.javacore.ZZKstreams.clas.People;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    //Pegar os tres primeiros nomes de pessoas com menos de 25 anos
    //Ordenados por nome
    public static void main(String[] args) {
        List<People> peopleList = People.dataPeople();
//        Collections.sort(peopleList, new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        Collections.sort(peopleList, (o1,o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(peopleList);
        List<String> names = new ArrayList<>();
        for(People people : peopleList){
            if (people.getAge() < 25){
                names.add(people.getName());
                if (names.size() >= 3)
                    break;
            }
        }

        System.out.println(names);
        System.out.println("\n\nSTREAMS\n");

        //UTILIZANDO STREAM

        List<String> namesStream = peopleList.stream()
                .filter(p-> p.getAge() < 25)
                .sorted(Comparator.comparing(People::getName))
                .limit(3)
                .map(People::getName) //Intermidiate
                .collect(Collectors.toList()); //Terminal
        System.out.println(namesStream);

        List<People> listStream = peopleList.stream()
                .sorted(Comparator.comparing(People::getName))
                .collect(Collectors.toList());
        System.out.println(listStream);

        System.out.println("UTILIZANDO HASHCODE E EQUALS");
        //UTILIZANDO HASHCODE E EQUALS
        System.out.println(peopleList.stream()
                .distinct()
                .count());
        peopleList.stream()
                .sorted(Comparator.comparing(People::getAge))
                .forEach(System.out::println);


    }
}
