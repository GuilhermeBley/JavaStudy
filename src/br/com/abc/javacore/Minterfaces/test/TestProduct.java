package br.com.abc.javacore.Minterfaces.test;

import br.com.abc.javacore.Minterfaces.clas.Product;

public class TestProduct {
    public static void main(String[] args) {
        Product p = new Product("Notebook Gamer", 0.1, 2000);
        p.taxCalculate();
        p.freightCalculate();
        System.out.println(p);
    }
}
