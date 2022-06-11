package br.com.abc.javacore.ZZBinternalClass.test;

import br.com.abc.javacore.ZZAgenerics.clas.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void walk(){
        System.out.println("Andando");
    }
}

public class AnonymousClassTest {
    public static void main(String[] args) {
        Animal a = new Animal(){
          public void walk(){
              System.out.println("Andando rapidamente");
          }
        };
        a.walk();

        List<Car> cardList = new ArrayList<>();
        cardList.add(new Car("Mustang"));
        cardList.add(new Car("Mitsubishi"));
        cardList.add(new Car("Audi"));
        cardList.add(new Car("Volks Wagen"));

        Collections.sort(cardList, new comparatorCar(){
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(cardList);

    }
}

class comparatorCar implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
