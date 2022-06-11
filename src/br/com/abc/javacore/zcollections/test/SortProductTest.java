package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Product;

import java.util.*;

//Criando classe para utilizar o Comparator
class ProductNameComparator implements Comparator<Product>{

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class SortProductTest {
    public static void main(String[] args) {
        List<Product> prod = new ArrayList<>();
        Product[] productsArray = new Product[4];

        Product product1 = new Product("Alface", 1.00, "345");
        Product product2 = new Product("Cenoura", 5.00, "321");
        Product product3 = new Product("Picanha", 60.00, "123");
        Product product4 = new Product("Acem",30.00 , "312");
        prod.add(product1);
        prod.add(product2);
        prod.add(product3);
        prod.add(product4);

        productsArray[0] = product1;
        productsArray[1] = product2;
        productsArray[2] = product3;
        productsArray[3] = product4;


        //Método Sort só pode ser utilizado no Product caso ele implemente o Comparable
//        Collections.sort(prod);
        //Para usar o metodo Comparator deve-se passar a sua classe criada como parâmetro.
        Collections.sort(prod, new ProductNameComparator());
        for (Product productsPrint : prod)
            System.out.println(productsPrint);

        //IMPRIMINDO ARRAYS
        System.out.println("-------------ARRAYS-------------");
        Arrays.sort(productsArray);
        for (Product productsPrint : productsArray)
            System.out.println(productsPrint);
    }
}
