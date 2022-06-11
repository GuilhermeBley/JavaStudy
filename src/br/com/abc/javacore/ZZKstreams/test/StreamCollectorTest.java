package br.com.abc.javacore.ZZKstreams.test;

import br.com.abc.javacore.ZZKstreams.clas.People;


import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamCollectorTest {
    //Redução e sumarização de Strams em um valor único
    //Agrupamento de elemento
    //Particionamento de elementos

    public static void main(String[] args) {
        List<People> peopleList = People.dataPeople();
        System.out.println((long) peopleList.size());
        System.out.println((Long) (long) peopleList.size());

        Optional<People> peopleSalaryMax = peopleList.stream().max(comparing(People::getSalary));
        System.out.println(peopleSalaryMax.get().getSalary());
        Optional<People> collect = peopleList.stream().max(comparing(People::getSalary));
        System.out.println(collect.get());
        Optional<People> collect1 = peopleList.stream().min(comparing(People::getSalary));
        System.out.println(collect1.get());

        System.out.println(peopleList.stream().mapToDouble(People::getSalary).sum());
        System.out.println((Double) peopleList.stream().mapToDouble(People::getSalary).sum());

        DoubleSummaryStatistics summarize = peopleList.stream().collect(summarizingDouble(People::getSalary));
        System.out.println(summarize.getAverage());

        System.out.println(peopleList.stream().map(People::getName).collect(joining()));
        System.out.println(peopleList.stream().map(People::getName).collect(joining(", ")));

    }
}
