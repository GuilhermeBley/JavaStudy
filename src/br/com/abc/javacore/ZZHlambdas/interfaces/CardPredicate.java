package br.com.abc.javacore.ZZHlambdas.interfaces;

import br.com.abc.javacore.ZZHlambdas.clas.Card;

@FunctionalInterface
public interface CardPredicate {
    boolean test(Card car);
    // Parametro -> <Expressao>
    // (Carro carro) -> carro.getColor().equals("Verde");
}
