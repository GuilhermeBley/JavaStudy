package br.com.abc.javacore.Lclassabstract.clas;

public class Manager extends Employee{

    public Manager() {
    }

    public Manager(String name, String clt, double salary) {
        super(name, clt, salary);
    }

    @Override
    public void calculateSalary() {
        this.salary = salary + (salary * 0.2);
    }
}
