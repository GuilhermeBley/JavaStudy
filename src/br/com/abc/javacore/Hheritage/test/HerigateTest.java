package br.com.abc.javacore.Hheritage.test;

import br.com.abc.javacore.Hheritage.clas.Adress;
import br.com.abc.javacore.Hheritage.clas.Employee;
import br.com.abc.javacore.Hheritage.clas.Person;

public class HerigateTest {
    public static void main(String[] args) {
//        Person p = new Person("Gabriel Toledo", "578.982.238.74");
        Adress adr = new Adress();
        Employee empl = new Employee("João Marcos");
//
//
//        adr.setNeighbh("Ciriaco");
//        adr.setStreet("23");
//        p.setAdress(adr);

//        p.print();
        System.out.println("\n\n------------------------------------");

        empl.setCpf("678.858.342-12");
        empl.setSalary(2000);
        empl.setAdress(adr);
//        empl.print();

    }
}
