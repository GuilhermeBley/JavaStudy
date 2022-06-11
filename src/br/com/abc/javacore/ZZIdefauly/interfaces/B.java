package br.com.abc.javacore.ZZIdefauly.interfaces;

public interface B extends A{
    default void oi(){
        System.out.println("Dentro do oi B");
    }
}
