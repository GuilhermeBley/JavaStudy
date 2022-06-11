package br.com.abc.javacore.Lclassabstract.test;

import br.com.abc.javacore.Lclassabstract.clas.Employee;
import br.com.abc.javacore.Lclassabstract.clas.Manager;
import br.com.abc.javacore.Lclassabstract.clas.Salesman;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Hugo Hess", "928913812", 12000);
        Salesman salesman = new Salesman("Tabata Cunha", "9129031982", 2000, 30000);

        //SALESMAN
        System.out.println("SalesMan");
        salesman.calculateSalary();
        System.out.println(salesman);

        //MANAGER
        System.out.println("\n-----------\nManager");
        manager.calculateSalary();
        System.out.println(manager);
    }
}
