package br.com.abc.javacore.ZZHlambdas.test;

import br.com.abc.javacore.ZZHlambdas.clas.Card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(asList("Gui", "DevDojo", "Facebook.com"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Gui", "DevDojo", "Facebook.com"), (String s) -> s.length());
        forEach(list, (Integer i) -> System.out.println(i));

        System.out.println("\n\n-----------Card-----------");
        List<String> listCard = map(asList(new Card("Branco", 2010),
                new Card("Amarelo", 2006),
                new Card("Rosa", 2012),
                new Card("Branco", 1995)),
                Card::getColor);
        System.out.println(listCard);

        Predicate<Integer> evenNumber = (Integer i) -> i % 2 == 0;
        System.out.println(evenNumber.test(1009));

        //ALTA PERFORMANCE
        IntPredicate oddNumber = (int i)-> i % 2 == 1;
        System.out.println(oddNumber.test(1009));
    }

    public static <T> void forEach (List<T> list, Consumer<T> c){
        for(T e: list){
            c.accept(e);
        }
    }

    public static <T,R> List<R> map (List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T e: list){
            result.add(f.apply(e));
        }
        return result;
    }
}
