package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {
        List<Product> prod = new ArrayList<>();

        Product product1 = new Product("Alface", 1.00, "345",5);
        Product product2 = new Product("Cenoura", 5.00, "321", 0);
        Product product3 = new Product("Picanha", 60.00, "123", 3);
        Product product4 = new Product("Acem", 30.00, "312", 1);
        prod.add(product1);
        prod.add(product2);
        prod.add(product3);
        prod.add(product4);


        //Iterator, maneira de percorrer Listas
        Iterator<Product> productIterator = prod.iterator();
        while (productIterator.hasNext()){
            //Product product = productIterator.next();
            if (productIterator.next().getAmount() == 0)
                productIterator.remove();
        }
        System.out.println(prod.size());


//        for (Product prodFor : prod)
//            if (prodFor.getAmount() == 0) MANEIRA ERRADA
//                prod.remove(prodFor);
    }
}
