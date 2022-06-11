package br.com.abc.javacore.ZZGbehaviorbyparameter.predicate;

import br.com.abc.javacore.ZZGbehaviorbyparameter.clas.Card;
import br.com.abc.javacore.ZZGbehaviorbyparameter.interfaces.CardPredicate;

import java.util.Calendar;

public class CardTenYearsPredicate implements CardPredicate {
    @Override
    public boolean test(Card car) {
        return car.getYear() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
