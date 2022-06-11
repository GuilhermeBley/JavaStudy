package br.com.abc.javacore.ZZDthreads.test;

public class DeadLock {
    public static void main(String[] args) {
        new ThreadExample1().start();
        new ThreadExample2().start();
    }

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    private static class ThreadExample1 extends Thread{
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 1:  Segurando Lock 1" +
                        "Thread 1 : Esperando pelo lock 2");

                synchronized (lock2){
                    System.out.println("Thread 1 : segurando lock 1 e lock 2");
                }

            }
        }
    }

    private static class ThreadExample2 extends Thread{
        public void run(){
            synchronized (lock2){
                System.out.println("Thread 2:  Segurando Lock 2" +
                        "Thread 2 : Esperando pelo lock 1");

                synchronized (lock1){
                    System.out.println("Thread 2 : segurando lock 2 e lock 1");
                }

            }
        }
    }
}
