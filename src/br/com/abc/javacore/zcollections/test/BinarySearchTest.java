package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(5);
        numbers.add(0);

        /**
         * Caso encontre o valor ele retorna a posição dele
         * Caso não encontre:
         (-(ponto de inserção) -1)
         */
        Collections.sort(numbers);
        //Tem que organizar o ArrayList antes de executar a pesquisa binária
        //2 7 5 0
        //0 2 5 7

        System.out.println(numbers.get(Collections.binarySearch(numbers, 7)));

        List<Product> prod = new ArrayList<>();

        Product product1 = new Product("Alface", 1.00, "345");
        Product product2 = new Product("Cenoura", 5.00, "321");
        Product product3 = new Product("Picanha", 60.00, "123");
        Product product4 = new Product("Acem", 30.00, "312");
        prod.add(product1);
        prod.add(product2);
        prod.add(product3);
        prod.add(product4);

        Collections.sort(prod, new ProductNameComparator());
        Product product5 = new Product("Antena Via satélite", 400, "000");
        for (Product productsPrint : prod)
            System.out.println(productsPrint);
        System.out.println(Collections.binarySearch(prod, product5, new ProductNameComparator()));

        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger, 1));

    }
}
