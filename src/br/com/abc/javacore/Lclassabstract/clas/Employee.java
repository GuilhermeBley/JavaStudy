package br.com.abc.javacore.Lclassabstract.clas;

public abstract class Employee {
    protected String name;
    protected String clt;
    protected double salary;

    public Employee() {
    }

    public Employee(String name, String clt, double salary) {
        this.name = name;
        this.clt = clt;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", clt='" + clt + '\'' +
                ", salary=" + salary +
                '}';
    }

    public abstract void calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
