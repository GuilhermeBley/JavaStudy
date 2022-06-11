package br.com.abc.javacore.ZZKstreams.clas;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class People {
    private String name;
    private int age;
    private double salary;
    private Gender gender;

    public People(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public People(String name, int age, double salary, Gender gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People:  " +
                "name= " + name + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static List<People> dataPeople() {
        return asList(new People("Bley", 18, 2032.00, Gender.MASCULINO),
                new People("Gi", 87, 201.00, Gender.FEMININO),
                new People("Roberto", 23, 20023.00, Gender.FEMININO),
                new People("Roberto", 12, 20023.00, Gender.MASCULINO),
                new People("Francielen", 65, 12352.00, Gender.FEMININO),
                new People("Theodoro", 46, 9882.00, Gender.MASCULINO),
                new People("Jumas", 17, 10234.00, Gender.MASCULINO),
                new People("Rosana", 21, 65436.00, Gender.FEMININO),
                new People("Will", 75, 1232.00, Gender.MASCULINO));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }
}
