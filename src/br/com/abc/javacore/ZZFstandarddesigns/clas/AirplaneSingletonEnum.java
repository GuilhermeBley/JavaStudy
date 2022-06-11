package br.com.abc.javacore.ZZFstandarddesigns.clas;

import java.util.HashSet;
import java.util.Set;

public enum AirplaneSingletonEnum {
    INSTANCE;
    private Set<String> avaliableSeats;

    AirplaneSingletonEnum() {
        this.avaliableSeats = new HashSet<>();
        avaliableSeats.add("1A");
        avaliableSeats.add("1B");
    }

    public boolean bookSeats (String seats){
        return avaliableSeats.remove(seats);
    }

    public static void scheduleSeats (String seats){
        AirplaneSingletonEnum a = AirplaneSingletonEnum.INSTANCE;
        System.out.println(a.bookSeats(seats));
    }
}
