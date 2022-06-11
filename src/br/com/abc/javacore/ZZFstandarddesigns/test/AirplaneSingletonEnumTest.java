package br.com.abc.javacore.ZZFstandarddesigns.test;

import br.com.abc.javacore.ZZFstandarddesigns.clas.AirplaneSingleton;

public class AirplaneSingletonEnumTest {
    public static void main(String[] args) {
        System.out.println(AirplaneSingleton.getINSTANCE().bookSeats("1A"));
        System.out.println(AirplaneSingleton.getINSTANCE().bookSeats("1B"));
        System.out.println(AirplaneSingleton.getINSTANCE().bookSeats("1B"));
    }
}
