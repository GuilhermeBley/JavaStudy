package br.com.abc.javacore.ZZFstandarddesigns.clas;

import java.util.HashSet;
import java.util.Set;

public class Airplane {
    private Set<String> availableSeats;

    public Airplane() {
        this.availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeats (String seats){
        return availableSeats.remove(seats);
    }
}
