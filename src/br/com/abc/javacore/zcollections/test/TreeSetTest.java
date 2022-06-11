package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Product;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Product product1 = new Product("Alface", 12.00, "345", 10);
        Product product2 = new Product("Cenoura", 5.00, "321", 11);
        Product product3 = new Product("Picanha", 60.00, "123", 1);
        Product product4 = new Product("Acem", 30.00, "312", 0);
        Product product5 = new Product("Xiaomi", 3000.00, "315", 1);
//        Mobile mobile1 = new Mobile("Iphone 12", "123");
        NavigableSet<Product> productNavigableSet = new TreeSet<>();
//        NavigableSet<Mobile> mobileNavigable = new TreeSet<>();

        productNavigableSet.add(product1);
        productNavigableSet.add(product2);
        productNavigableSet.add(product3);
        productNavigableSet.add(product4);
        productNavigableSet.add(product5);
        for (Product productFor : productNavigableSet)
            System.out.println(productFor);

        System.out.println("---------------- Métodos Navigable Set ----------------\n\n");
        //Lower (Retorna o ultimo) <
        //floor <=
        //Higher >
        //celling >=
        System.out.println(productNavigableSet.lower(product1));

    }
}
