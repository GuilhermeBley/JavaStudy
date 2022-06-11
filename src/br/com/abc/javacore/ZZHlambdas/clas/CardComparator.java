package br.com.abc.javacore.ZZHlambdas.clas;

public class CardComparator {
    public static int compareBycolor(Card card1, Card card2){
        return card1.getColor().compareTo(card2.getColor());
    }
    public int compareForYear (Card card1, Card card2){
        return ((Integer) card1.getYear()).compareTo(card2.getYear());
    }
}
