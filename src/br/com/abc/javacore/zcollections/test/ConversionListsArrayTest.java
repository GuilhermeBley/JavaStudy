package br.com.abc.javacore.zcollections.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionListsArrayTest {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(2);
        integerList1.add(7);
        integerList1.add(0);
        integerList1.add(1);

//        Collections.sort(integerList);
        Integer[] integerArray1 = new Integer[integerList1.size()];
        integerList1.toArray(integerArray1);
        System.out.println("----------De Lists para Arrays----------");
        System.out.println(integerList1);
        System.out.println(Arrays.toString(integerArray1));

        Integer[] integerArray2 = new Integer[4];
        integerArray2[0] = 8;
        integerArray2[1] = 10;
        integerArray2[2] = 5;
        integerArray2[3] = 7;
        //IntegerList2 tem o mesmo valor de memória do IntegerArray2,
        //Fazendo com que o que altere em um altere em outro
        List<Integer> integerList2 = Arrays.asList(integerArray2);

        //Por conta disso é feito o procedimento abaixo
        List<Integer> integerList3 = new ArrayList<>();
        integerList3.addAll(integerList2);

        System.out.println("----------De Arrays para Lists----------");
        System.out.println(Arrays.toString(integerArray2));
        System.out.println(integerList3);

    }
}
