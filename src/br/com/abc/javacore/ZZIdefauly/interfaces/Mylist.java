package br.com.abc.javacore.ZZIdefauly.interfaces;

public interface Mylist {
    static void sort(){
        System.out.println("Metodos statico tem que ter corpo, em Interfaces");
    }

    void add();
    //No JAVA 8 foi implementado a palavra Default, que faz com que o metodo não precise ser sobrescrito
    default void remove(){
        System.out.println("Dentro do remove");
    }
}
