package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Consumer;
import br.com.abc.javacore.zcollections.clas.Product;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumer consumer = new Consumer("Guilherme Bley", "123");
        Consumer consumer2 = new Consumer("Tapeçaria Bley", "321");

        Product product1 = new Product("Alface", 1.00, "345");
        Product product2 = new Product("Cenoura", 5.00, "321");
        Product product3 = new Product("Picanha", 60.00, "123");
        Product product4 = new Product("Acem", 30.00, "312");

        Map<Consumer, List<Product>> map = new LinkedHashMap<>();

        List<Product> productConsumer1 = new ArrayList<>();
        productConsumer1.add(product1);
        productConsumer1.add(product2);
        List<Product> productConsumer2 = new ArrayList<>();
        productConsumer2.add(product3);
        productConsumer2.add(product4);

        map.put(consumer, productConsumer1);
        map.put(consumer2, productConsumer2);

        for (Map.Entry<Consumer, List<Product>> entryFor : map.entrySet()){
            System.out.print(entryFor.getKey().getName() + ": ");
            for (Product productFor : entryFor.getValue()){
                System.out.print(productFor.getName() + "\n");
            }
        }

    }
}
