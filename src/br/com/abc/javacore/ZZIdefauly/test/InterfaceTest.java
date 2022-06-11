package br.com.abc.javacore.ZZIdefauly.test;

import br.com.abc.javacore.ZZIdefauly.interfaces.Mylist;

public class InterfaceTest implements Mylist{
    public static void main(String[] args) {
        Mylist.sort();
    }

    @Override
    public void add() {
        System.out.println("Dentro do add");
    }

}
