package br.com.abc.javacore.ZZGbehaviorbyparameter.predicate;

import br.com.abc.javacore.ZZGbehaviorbyparameter.clas.Card;
import br.com.abc.javacore.ZZGbehaviorbyparameter.interfaces.CardPredicate;

public class ColorGreenCardPredicate implements CardPredicate {
    @Override
    public boolean test(Card car) {
        return car.getColor().equals("Verde");
    }
}
