package br.com.abc.javacore.Lclassabstract.clas;

public class Salesman extends Employee {
    private double totalSales;

    public Salesman() {
    }

    public Salesman(String name, String clt, double salary, double totalSales) {
        super(name, clt, salary);
        this.totalSales = totalSales;
    }

    @Override
    public void calculateSalary() {
        this.salary = salary + (totalSales*0.05);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
}
