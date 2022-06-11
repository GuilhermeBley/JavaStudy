package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ColectionsConcurrencTest {
    public static void main(String[] args) {
        //ConcurrentHashMap
        //ConcurrentLinkedDeque
        //ConcurrentLinkedQueue
        //ConcurrentSkipListMap
        //ConcurrentSkipListSet

        ConcurrentMap<Integer, String> mapConcurrent= new ConcurrentHashMap<>();
        mapConcurrent.put(1, "um");
        mapConcurrent.putIfAbsent(1, "dois");
        System.out.println(mapConcurrent.get(1));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "um");
        map.put(1, "dois");
        System.out.println(map.get(1));
    }
}
