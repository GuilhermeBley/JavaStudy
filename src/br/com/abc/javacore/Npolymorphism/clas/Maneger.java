package br.com.abc.javacore.Npolymorphism.clas;

public class Maneger extends Employee{
    private double profitShare;

    public Maneger(String name, double salary, double profitShare) {
        super(name, salary);
        this.profitShare = profitShare;
    }

    @Override
    public void calculatePayment() {
        this.salary = this.salary + profitShare;
    }

    public double getProfitShare() {
        return profitShare;
    }

    public void setProfitShare(double profitShare) {
        this.profitShare = profitShare;
    }
}
