package br.com.abc.javacore.ZZKstreams.test;

import br.com.abc.javacore.ZZKstreams.clas.People;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindingMatchingTest {
    public static void main(String[] args) {
        List<People> peopleList = People.dataPeople();
        System.out.println(peopleList.stream().anyMatch(p->p.getSalary() > 4000));
        System.out.println(peopleList.stream().allMatch(p->p.getAge() >= 18));
        System.out.println(peopleList.stream().noneMatch(p->p.getAge() >= 18));
        peopleList.stream()
                .filter(p->p.getAge() < 25)
                .findAny()
                .ifPresent(p-> System.out.println(p.getName()));

        peopleList.stream()
                .filter(p->p.getAge() > 30)
                .sorted(Comparator.comparing(People::getAge).reversed())
                .findFirst()
                .ifPresent(p-> System.out.println(p.getName()));

    }
}
