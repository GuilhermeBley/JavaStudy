package br.com.abc.javacore.ZZDthreads.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class NameList{
    private List<String> names = Collections.synchronizedList(new LinkedList<>());

    //Sem o synchronized nos métodos abaixo podem ocorrer erros,
    //por mais que o metodo names ja utilize o synchronized,
    //por conta disso são utilizados nos dois abaixo
    public synchronized void add (String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if(names.size() > 0)
            System.out.println(names.remove(0));
    }
}

public class ThreadSafe {
    public static void main(String[] args) {
        NameList name = new NameList();
        name.add("Gui C Bley");
        class NameRemover extends Thread{
            public void run(){
                name.removeFirst();
            }
        }


        new NameRemover().start();
        new NameRemover().start();
    }
}
