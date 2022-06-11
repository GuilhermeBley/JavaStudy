package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        final ReentrantLock lock = new ReentrantLock();
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
        new Thread(new Worker("E", lock)).start();
        new Thread(new Worker("F", lock)).start();
        new Thread(new Worker("G", lock)).start();
    }

    static class Worker implements Runnable{
        private String name;
        private ReentrantLock reentrantLock;

        public Worker(String name, ReentrantLock reentrantLock) {
            this.name = name;
            this.reentrantLock = reentrantLock;
        }

        @Override
        public void run() {
            reentrantLock.lock();
            try{
                if (reentrantLock.isHeldByCurrentThread()){
                    System.out.printf("Thread %s entrou em uma seção crítica%n", name);
                }
                System.out.printf("%d Threads esperando na fila%n", reentrantLock.getQueueLength());
                System.out.printf("Thread %s vai trabalhar pro 2 segundos %n", name);
                Thread.sleep(2000);
                System.out.printf("Thread %s finalizou o trabalho%n%n", name);
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                reentrantLock.unlock();
            }
        }
    }
}
