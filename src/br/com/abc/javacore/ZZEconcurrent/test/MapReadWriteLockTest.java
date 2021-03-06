package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MapReadWrite {
    private Map<String, String> map = new LinkedHashMap<>();

    public void put (String key, String value){
        map.put(key, value);
    }

    public Object[] allKeys(){
        return map.keySet().toArray();
    }
}

public class MapReadWriteLockTest {
    private final static MapReadWrite mapReadWrite = new MapReadWrite();
    private static final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Write());
        Thread t2 = new Thread(new ReadA());
        Thread t3 = new Thread(new ReadB());

        t1.start();
        t2.start();
        t3.start();
    }

    static class Write implements Runnable{

        @Override
        public void run() {
            for (int index = 0; index < 50; index++){
//                Lock lock = rwl.writeLock();
//                lock.lock;
                rwl.writeLock().lock();
                try {
                    mapReadWrite.put(String.valueOf(index), String.valueOf(index));
                }finally {
                    rwl.writeLock().unlock();
                }
            }
        }
    }

    static class ReadA implements Runnable{

        @Override
        public void run() {
            for (int index = 0; index < 10; index++){
                rwl.readLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() + " " +
                            Arrays.toString(mapReadWrite.allKeys()));
                }finally {
                    rwl.readLock().unlock();
                }
            }
        }
    }

    static class ReadB implements Runnable{

        @Override
        public void run() {
            for (int index = 0; index < 10; index++){
                rwl.readLock().lock();
                try{
                    System.out.println(Thread.currentThread().getName() + " " +
                            Arrays.toString(mapReadWrite.allKeys()));
                }finally {
                    rwl.readLock().unlock();
                }
            }
        }
    }
}
