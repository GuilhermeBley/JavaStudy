package br.com.abc.javacore.zcollections.test;

//import br.com.abc.javacore.zcollections.clas.Consumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

//        Consumer consumer = new Consumer("Guilherme Bley", "123");
//        Consumer consumer2 = new Consumer("Tapeçaria Bley", "321");
//        map.put("A", consumer);
//        map.put("D", consumer2);
        map.put("B", "Letra B");
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("C", "Letra C");

        for (Map.Entry<String, String> entryFor : map.entrySet()){
            System.out.println(entryFor.getKey() + "   " + entryFor.getValue());
        }

        System.out.println(map.headMap("C"));
        System.out.println(map.descendingMap());
    }
}
