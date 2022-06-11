package br.com.abc.javacore.ZZHlambdas.test;

import br.com.abc.javacore.ZZAgenerics.clas.Car;
import br.com.abc.javacore.ZZHlambdas.clas.Card;
import br.com.abc.javacore.ZZHlambdas.interfaces.CardPredicate;

import java.util.function.Predicate;

public class LambdaTest {
    //anonima
    //Concisa
    //Funcão
    //Passável

    //(Carro carro) -> carro.getColor().equals...
    public static void main(String[] args) {
        CardPredicate cardPredicate = new CardPredicate() {
            @Override
            public boolean test(Card car) {
                return car.getColor().equals("Vermelho");
            }
        };

//        CardPredicate cardPredicate2 = (Card card) -> {return card.getColor().equals("Verde");};
        Predicate<Card> cardPredicate2 = (Card card) -> card.getColor().equals("Verde");
//        CardPredicate cardPredicate2 = (Card card) -> card.getColor().equals("Verde");
        System.out.println(cardPredicate2.test(new Card("Vermelho", 2009)));


        Runnable runnable = () -> System.out.println("Dentro do run");
        new Thread(runnable).start();
    }
}
