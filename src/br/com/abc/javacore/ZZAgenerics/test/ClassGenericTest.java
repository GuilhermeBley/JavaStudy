package br.com.abc.javacore.ZZAgenerics.test;

import br.com.abc.javacore.ZZAgenerics.clas.Car;
import br.com.abc.javacore.ZZAgenerics.clas.Computer;

import java.util.ArrayList;
import java.util.List;

public class ClassGenericTest {
    public static void main(String[] args) {
        List<Car> CarList = new ArrayList<>();
        CarList.add(new Car("Civic"));
        CarList.add(new Car("Hyundai"));

        RentableObjects<Car> cardRentable = new RentableObjects<>(CarList);
        Car car = cardRentable.getObjectAvailable();
        System.out.println("Usando o carro por um mes");
        cardRentable.returnObject(car);

        System.out.println("--------------- Computadores ---------------");

        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer("INTEL"));
        computerList.add(new Computer("AMD"));

        RentableObjects<Computer> computerRentable = new RentableObjects<>(computerList);
        Computer computer = computerRentable.getObjectAvailable();
        System.out.println("Usando o computador por um mes");
        computerRentable.returnObject(computer);
    }
}

//T = type
class RentableObjects<T>{
    private List<T> objectsAvailable;

    public RentableObjects(List<T> rentableObjects) {
        this.objectsAvailable = rentableObjects;
    }

    //Rentable
    public T getObjectAvailable(){
        T t = objectsAvailable.remove(0);
        System.out.println(" Alugando objeto " + t);
        System.out.println("Objetos disponiveis: " + objectsAvailable);
        return t;
    }

    public void returnObject(T t){
        System.out.println("Devolvendo objeto: " + t);
        objectsAvailable.add(t);
        System.out.println("Objetos disponiveis: " + objectsAvailable);
    }


}

class TwoAttributes <T,X>{
    T one;
    X two;

    public TwoAttributes(T one, X two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public X getTwo() {
        return two;
    }

    public void setTwo(X two) {
        this.two = two;
    }
}
