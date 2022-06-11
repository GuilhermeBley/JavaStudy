package br.com.abc.javacore.ZZFstandarddesigns.clas;

import java.util.HashSet;
import java.util.Set;

public class AirplaneSingleton {
        //EAGLE INITIALIZATION
//    private static final AirplaneSingleton INSTANCE = new AirplaneSingleton();
    private static AirplaneSingleton INSTANCE;
    private Set<String> availableSeats;

        //LAZY INITIALIZATION
    public static AirplaneSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AirplaneSingleton.class){
                INSTANCE = new AirplaneSingleton();
            }
        }
        return INSTANCE;
    }

    public AirplaneSingleton() {
        this.availableSeats = new HashSet<>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeats (String seat){
        return availableSeats.remove(seat);
    }
}
