package br.com.abc.javacore.ZZHlambdas.test;

import br.com.abc.javacore.ZZHlambdas.clas.Card;
import br.com.abc.javacore.ZZHlambdas.clas.CardComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

//Metodo Reference
public class LambdaReferencesTest {
    public static void main(String[] args) {
//        forEach(asList("Gui", "DevDojo", "Facebook.com"), s -> System.out.println(s));
        List<Card> listCard = asList(new Card("Branco", 2010),
                new Card("Amarelo", 2006),
                new Card("Rosa", 2012),
                new Card("Branco", 1995));
        forEach(asList("Gui", "DevDojo", "Facebook.com"), System.out::println);

        /**Reference to a static Method*/
        System.out.println("ListCard antes: " + listCard);
//        Collections.sort(listCard, (o1, o2) -> o1.getColor().compareTo(o2.getColor())); //Não é possivel utilizar o reference nesse caso
        Collections.sort(listCard, CardComparator::compareBycolor);
        System.out.println("ListCard após sort: " + listCard);


        /**Reference to an instance method of a particular Object*/
        CardComparator cardComparator = new CardComparator();
        Collections.sort(listCard, cardComparator::compareForYear);
        System.out.println("Compando por ano: \n" + listCard);


        /**Reference to an instance method of an arbitrary object of  a particular type*/
        List<String> listNames = asList("Gui", "Jão", "Gilberto", "Tabata", "Angelo");
//        listNames.sort((name1, name2) -> name1.compareTo(name2));
        listNames.sort(String::compareTo);
        System.out.println(listNames);

//        Function<String, Integer> stringInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringInteger = Integer::parseInt;

        BiPredicate<List<String>, String> contains = (listContains, elements) -> listContains.contains(elements);
        BiPredicate<List<String>, String> contains2 = List::contains;
        int testInteger = stringInteger.apply("10");
        System.out.println(testInteger);
        System.out.println(contains2.test(listNames, "Gui"));


        /**Reference to a contructor */
        Supplier<CardComparator> cardComparatorSupplier = CardComparator::new;
        System.out.println(cardComparator.getClass());

        BiFunction<String, Integer, Card> cardBiFunction = (s,i) -> new Card(s,i);
        BiFunction<String, Integer, Card> cardBiFunction2 = Card::new;

        System.out.println(cardBiFunction2.apply("Rosa", 2003));

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
