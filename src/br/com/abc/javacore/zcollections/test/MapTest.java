package br.com.abc.javacore.zcollections.test;

//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Map <KeySet, Values>
        //LinkedHashMap mantem a ordem de inserção
        Map<String, String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "voce");
        map.put("Meza", "mesa");

//Modelo Map.Entry tem mais eficiência
        //        for (String key: map.keySet()){
//            System.out.println(key);
//        }

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
