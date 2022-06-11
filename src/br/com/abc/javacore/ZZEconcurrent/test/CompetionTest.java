package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CompetionTest {
    public static void main(String[] args) throws InterruptedException {
        Accountant accountant = new Accountant();
        IncrementerThread t1 = new IncrementerThread(accountant);
        IncrementerThread t2 = new IncrementerThread(accountant);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(accountant.getCount());
        System.out.println(accountant.getAtomicInteger());
    }
}

class Accountant {
    private int count;
    private final AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock();

   //Utilizando Lock
    public void increment() {
        lock.lock();
        try{
            count++;
            atomicInteger.getAndIncrement();
        }finally {
            lock.unlock();
        }
    }

    //UTILIZANDO ATOMIC
//    public void increment() {
//      atomicInteger.getAndIncrement();
//    }

    //Poderia utilizar o metodo Synchronized, porem ele é custoso
//    public synchronized void increment(){
//        count++;
//    }
    //Por conta disso existem outro meios


    public int getAtomicInteger() {
        return atomicInteger.intValue();
    }

    public int getCount() {
        return count;
    }
}

class IncrementerThread extends Thread {
    private final Accountant accountant;

    public IncrementerThread(Accountant accountant) {
        this.accountant = accountant;
    }

    public void run() {
        for (int index = 0; index < 10000; index++) {
            accountant.increment();
        }
    }
}



