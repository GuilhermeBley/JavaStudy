package br.com.abc.javacore.Npolymorphism.clas;

public class Salesman extends Employee {
    private double totalSales;

    public Salesman(String name, double salary, double totalSales) {
        super(name, salary);
        this.totalSales = totalSales;
    }

    @Override
    public void calculatePayment() {
        this.salary = this.salary + totalSales * 0.5;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
}
