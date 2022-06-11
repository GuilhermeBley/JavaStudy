package br.com.abc.javacore.Coverloadmethods.test;

import br.com.abc.javacore.Coverloadmethods.clas.Employee;

public class testEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Roberto Tavares", "123.865.765-84", 1004, "835.854.067-8");

//        employee.initialize("Roberto Tavares", "123.865.765-84", 1004, "835.854.067-8");

        employee.print();
    }
}
