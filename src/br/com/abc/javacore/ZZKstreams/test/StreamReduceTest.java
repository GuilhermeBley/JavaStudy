package br.com.abc.javacore.ZZKstreams.test;

import br.com.abc.javacore.ZZKstreams.clas.People;

import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamReduceTest {
    public static void main(String[] args) {
        Optional<Integer> reduce = getStream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        Integer sum = getStream().reduce(0,(x, y) -> x + y);
        System.out.println(sum);

        Optional<Integer> listInteger2 = getStream().reduce(Integer::sum);
        System.out.println(listInteger2.get());

        Integer multiply = getStream().reduce(1,(x,y)-> x*y);
        System.out.println(multiply);

//        Optional<Integer> max = getStream().reduce((x,y) -> x > y ? x : y);
        Optional<Integer> max = getStream().reduce(Integer::max);
        System.out.println(max.get());

        Stream<People> peopleStream = People.dataPeople().stream();
        System.out.println(peopleStream
                .filter(p -> p.getSalary() > 4000)
                .map(People::getSalary)
                .reduce(Double::sum).get());

        Double sumStream = People.dataPeople().stream()
                .filter(p->p.getSalary()>4000)
                .mapToDouble(People::getSalary)
                .sum();
        System.out.println(sumStream);

        DoubleStream doubleStream = People.dataPeople().stream()
                .mapToDouble(People::getSalary);
        Stream<Double> returnForStream = doubleStream.boxed();
    }

    private static Stream<Integer> getStream() {
        return asList(1, 2, 3, 4, 5, 6).stream();
    }
}
