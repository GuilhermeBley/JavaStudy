package br.com.abc.javacore.ZZAgenerics.test;

import br.com.abc.javacore.ZZAgenerics.clas.Car;
import br.com.abc.javacore.ZZAgenerics.clas.Computer;

import java.util.ArrayList;
import java.util.List;

public class ClassNOTGenericTest {
    public static void main(String[] args) {
        RentableCard rentableCard1 = new RentableCard();
        Car rentedCar = rentableCard1.getCarAvailable();
        System.out.println("Usando o carro por um mes");
        rentableCard1.returnCar(rentedCar);

        System.out.println("--------------- COMPUTADOR ---------------");
        RentableComputer rentableComputer1 = new RentableComputer();
        Computer computer = rentableComputer1.getCarAvailable();
        System.out.println("Usando PC");
        rentableComputer1.returnComputer(computer);
    }
}

class RentableCard{
    private List<Car> carsAvailable = new ArrayList<>();

    {
        carsAvailable.add(new Car("Gol g4"));
        carsAvailable.add(new Car("Corolla"));
    }

    //Rentable
    public Car getCarAvailable(){
        Car c = carsAvailable.remove(0);
        System.out.println(" Alugando carro: " + c);
        return c;
    }

    public void returnCar(Car c){
        System.out.println("Devolvendo carro: " + c);
        carsAvailable.add(c);
        System.out.println("Carros disponiveis: " + carsAvailable);
    }


}

class RentableComputer{
    private List<Computer> computerAvailable = new ArrayList<>();

    {
        computerAvailable.add(new Computer("AMD"));
        computerAvailable.add(new Computer("Intel"));
    }

    //Rentable
    public Computer getCarAvailable(){
        Computer c = computerAvailable.remove(0);
        System.out.println(" Alugando computador: " + c);
        return c;
    }

    public void returnComputer(Computer c){
        System.out.println("Devolvendo computador: " + c);
        computerAvailable.add(c);
        System.out.println("Computadores disponiveis: " + computerAvailable);
    }


}