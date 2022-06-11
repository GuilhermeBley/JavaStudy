package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Mobile;

import java.util.ArrayList;
import java.util.List;

public class ListMobileTest {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Mi note 7", "2345678");
        Mobile mobile2 = new Mobile("Iphone 9", "1345678");
        Mobile mobile3 = new Mobile("Moto 6", "0345678");

        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(mobile1);
        mobileList.add(mobile2);
        mobileList.add(mobile3);

        for (Mobile mobile : mobileList)
            System.out.println(mobile);

        //Existe o celular na lista
        System.out.println("\n\nCelulares existentes: ");
        Mobile mobile4 = new Mobile("Mi note 7", "2345678");
        System.out.println("Contains: " + mobileList.contains(mobile4));
        System.out.println("Equals: " + mobile1.equals(mobile4));
        System.out.println("Comparando pelo endereço de memória: " + (mobile1==mobile4));
    }
}
