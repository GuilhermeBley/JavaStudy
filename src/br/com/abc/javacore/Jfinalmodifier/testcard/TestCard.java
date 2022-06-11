package br.com.abc.javacore.Jfinalmodifier.testcard;

import br.com.abc.javacore.Jfinalmodifier.clas.Card;

public class TestCard {
    public static void main(String[] args) {
        Card c = new Card();
        System.out.println(c.getBuyer());
        c.getBuyer().setName("Goku");
        System.out.println(c.getBuyer());
    }
}
