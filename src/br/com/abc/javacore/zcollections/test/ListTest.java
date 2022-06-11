package br.com.abc.javacore.zcollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        /**
        SEM UTILIZAR GENERICS

        List names = new ArrayList();
        names.add("Willian");
        names.add("Bleyzer");
        names.add(new Person("gui"));

        for (Object name: names){
            System.out.println(name);
        }
         */

        //Utilizando Generics
        //Sendo assim ja é predeterminado que tem que ser do tipo String a entrada
        List<String> names = new ArrayList<>();

        names.add("Bleyzer");
        names.add("Guilbor");
        //Não podendo utilizar qualquer objeto
//        names.add(new Person("Ola"));

//        for (String name: names) System.out.println(name);

        names.add("Ola");
//        for (String name: names) System.out.println(name);
        names.remove("gui");
//        Remove todos elementos do ARRAYLIST names.clear();
        int sizeString = names.size();
        for (int index = 0; index < sizeString; index++){
            System.out.println(names.get(index));
        }




        //Não é possível fazer de tipos primitivos
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        int sizeNum = numbers.size();
        System.out.println("---------NUM---------");
        for(int index = 0; index < sizeNum; index++ ) System.out.println(numbers.get(index));
    }
}
