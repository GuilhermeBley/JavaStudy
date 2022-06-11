package br.com.abc.javacore.Abeginningclass.test;

import br.com.abc.javacore.Abeginningclass.clas.CardClass;

public class CardTest {
    public static void main(String[] args) {
        CardClass card = new CardClass();

        card.plate = "abc 2121";
        card.model = "Toyota";
        card.speedMax = 230f;

        System.out.println(card.plate +"\n"+ card.model +"\n"+ card.speedMax);

    }
}
