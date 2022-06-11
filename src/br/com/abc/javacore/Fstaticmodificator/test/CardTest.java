package br.com.abc.javacore.Fstaticmodificator.test;

import br.com.abc.javacore.Fstaticmodificator.classes.Card;

public class CardTest {
    public static void main(String[] args) {
        Card card = new Card("BMW", 200);
        Card card2 = new Card("Gol g3", 160);
        Card card3 = new Card("Fiorino", 150);

        card.print();
        card2.print();
        card3.print();

        System.out.println("_________________________\n\n");

        Card.setSpeedLimit(200);
//Incorrect way from the calling:
//      card.speedLimit(220);

        card.print();
        card2.print();
        card3.print();
    }
}
