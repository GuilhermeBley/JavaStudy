package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

public class CopyOnWriteTest implements Runnable{
    public static void main(String[] args) {
        CopyOnWriteTest ct = new CopyOnWriteTest();
        Thread t1 = new Thread(ct);
        Thread t2 = new Thread(ct);
        Thread remove1 = new Thread(new MemberRemove(ct.getList()));

        t1.start();
        t2.start();
        remove1.start();
    }

    private static class MemberRemove implements Runnable{

        private List<Integer> list;

        public MemberRemove(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            for (int i = 0; i < 500; i++) {
                System.out.println(Thread.currentThread().getName() + " removeu " +
                        list.remove(i));
            }
        }
    }

                                    //Faz com que os Lists não possam ser alterados
    private List<Integer> list = new CopyOnWriteArrayList<>();
//    private Set<Integer> set = new CopyOnWriteArraySet<>();

    public CopyOnWriteTest() {
        for(int index = 0; index < 9000; index++){
            list.add(index);
        }
    }

    @Override
    public void run() {
        Iterator<Integer> iterator = list.iterator();
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        while (iterator.hasNext()){
            System.out.println(Thread.currentThread().getName() + " "
            + iterator.next());
        }
    }

    public List<Integer> getList() {
        return list;
    }
}

//Classes imutaveis
//final class Person {
//    private final String name;
//
//    Person(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
