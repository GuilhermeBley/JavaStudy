package br.com.abc.javacore.ZZAgenerics.test;

//Wild Card Caracter Coringa da Collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal implements Comparable{

    @Override
    public void consult() {
        System.out.println("Consultando Cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Cat extends Animal{

    @Override
    public void consult() {
        System.out.println("Consultando Gato");
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};

//        consultAnimals(dogs);
//        consultAnimals(cats);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
//        consultAnimals(dogList); //Erro em tempo de compilação
        consultAnimalsList(catList);
        consultAnimalsList(dogList);

        orderList(dogList);
    }

    public static void consultAnimals (Animal[] animals){
        for (Animal animalFor : animals)
            animalFor.consult();

//        animals[1] = new Cat(); //Ocorrera um erro em tempo de execução
    }

    public static void consultAnimalsList(List<? extends Animal> animalList){
        for (Animal animalfor : animalList)
            animalfor.consult();

        //Não é possível adicionar nenhum objeto no List

    }

    public static void consultDogsList(List <? super Dog> dogList){
        Dog d1 = new Dog();
        Animal d2 = new Dog();
        Object d3 = new Dog();

        dogList.add(new Dog());
//        dogList.add(new Animal()); //Não é possivel fazer isso
    }

    public static void orderList(List <? extends Comparable> list){
        Collections.sort(list);
    }
}
