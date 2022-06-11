package br.com.abc.javacore.ZZFstandarddesigns.test;

import br.com.abc.javacore.ZZFstandarddesigns.clas.Airplane;

public class AirplaneTest {
    public static void main(String[] args) {
        scheduleSeat("1A");
        scheduleSeat("1A");

    }

    private static void scheduleSeat(String seat){
        Airplane a = new Airplane();
        System.out.println(a.bookSeats(seat));
    }
}
