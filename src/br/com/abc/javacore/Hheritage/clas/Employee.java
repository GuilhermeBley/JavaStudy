package br.com.abc.javacore.Hheritage.clas;

public class Employee extends Person{
    private double salary;

    public Employee (String name){
        super(name);
        System.out.println("Dentro do construtor funcionario");
    }

    {
        System.out.println("Bloco de inicialização funcionário 1");
    }

    static {
        System.out.println("Bloco de inicialização static funcionário");
    }

    {
        System.out.println("Bloco de inicialização funcionário 2");
    }

    public void print(){
        super.print();
        System.out.println("Salário: " + this.salary);
        printReceiptPayment();
    }

    private void printReceiptPayment(){
        System.out.println("Eu " + super.name + " recebo o pagamento de " + this.salary);
    }

    public double getSalary() {return salary;}
    public void setSalary(double salary) {this.salary = salary;}
}
