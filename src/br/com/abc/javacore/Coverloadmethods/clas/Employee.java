package br.com.abc.javacore.Coverloadmethods.clas;

public class Employee {
    private String name;
    private String cpf;
    private double salary;
    private String rg;

    //CONSTRUCTOR
    public Employee(String name, String cpf, double salary, String rg) {
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
        this.rg = rg;
    }


    public void initialize(String name, String cpf, double salary){
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }

    public void initialize(String name, String cpf, double salary, String rg){
        initialize(name, cpf, salary);
        this.rg = rg;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.cpf);
        System.out.println(this.salary);
        System.out.println(this.rg);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setRg (String rg){this.rg = rg;}

    public String getName(){
        return this.name;
    }
    public String getCpf(){
        return this.cpf;
    }
    public double getSalary(){
        return this.salary;
    }
    public String rg (){return this.rg;}
}
