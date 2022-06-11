package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Product;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Product product1 = new Product("Alface", 1.00, "345", 10);
        Product product2 = new Product("Cenoura", 5.00, "321", 11);
        Product product3 = new Product("Picanha", 60.00, "123", 1);
        Product product4 = new Product("Acem", 30.00, "312", 0);

        //HashSet não mantem a ordem de inserção
        Set<Product> productSet = new LinkedHashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);

        for (Product productFor : productSet)
            System.out.println(productFor);
    }
}
