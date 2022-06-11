package br.com.abc.javacore.Npolymorphism.test;

import br.com.abc.javacore.Npolymorphism.clas.Employee;
import br.com.abc.javacore.Npolymorphism.clas.Maneger;
import br.com.abc.javacore.Npolymorphism.clas.PaymentReport;
import br.com.abc.javacore.Npolymorphism.clas.Salesman;

public class TestPolymorphism {
    public static void main(String[] args) {
        Maneger m = new Maneger("Kaleb Ug", 2000, 1200);
        Salesman s = new Salesman("Guilherme Bleyzer", 3000, 10000);
        PaymentReport report = new PaymentReport();
//        report.reportSalaryManager(m);
//        System.out.println("\n-------------\n");
//        report.reportSalarySalesman(s);
        report.reportPaymentGeneric(m);
        System.out.println("--------------------");
        report.reportPaymentGeneric(s);


    }
}
