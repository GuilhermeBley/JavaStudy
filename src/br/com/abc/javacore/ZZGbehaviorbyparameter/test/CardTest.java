package br.com.abc.javacore.ZZGbehaviorbyparameter.test;

import br.com.abc.javacore.ZZGbehaviorbyparameter.clas.Card;
import br.com.abc.javacore.ZZGbehaviorbyparameter.interfaces.CardPredicate;
import br.com.abc.javacore.ZZGbehaviorbyparameter.predicate.CardTenYearsPredicate;
import br.com.abc.javacore.ZZGbehaviorbyparameter.predicate.ColorGreenCardPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class CardTest {
    private static List<Card> filterGreenCard (List<Card> cards){
        List<Card> result = new ArrayList<>();
        for (Card car: cards) {
            if(car.getColor().equals("Verde"))
            result.add(car);
        }

        return result;
    }

    private static List<Card> filterColorCard (List<Card> cards, String color){
        List<Card> result = new ArrayList<>();
        for (Card car: cards) {
            if(car.getColor() == color)
                result.add(car);
        }

        return result;
    }

    public static List<Card> filterCard(List<Card> cards, CardPredicate cardPredicate){
        List<Card> result = new ArrayList<>();
        for (Card card:cards){
            if(cardPredicate.test(card)){
                result.add(card);
            }
        }
        return result;
    }

    public static <T> List<T> filter (List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T e: list){
            if (predicate.test(e)){
                result.add(e);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Card> cards = asList(new Card( "Branco", 2018),
                new Card( "Amarelo", 2017),
                new Card( "Vermelho", 2002),
                new Card( "Verde", 1995),
                new Card( "Vermelho", 2006));

//        System.out.println(filterGreenCard(cards));//Modelo pouco aproveitativo
//        System.out.println(filterColorCard(cards, "Vermelho"));

        System.out.println(filterCard(cards, new CardTenYearsPredicate()));
        System.out.println(filterCard(cards, new ColorGreenCardPredicate()));

        System.out.println("---------------------PREDICATE---------------------\n\n");

        System.out.println(filter(cards, new Predicate<Card>() {
            @Override
            public boolean test(Card card) {
                return card.getColor().equals("Vermelho");
            }
        }));
    }
}
