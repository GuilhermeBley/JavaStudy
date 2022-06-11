package br.com.abc.javacore.ZZDthreads.test;

//Threads Daemond x User
//User = JVM não finaliza em quanto houver essa Thread aberta
//Daemon = JVM encerra independente dela

class ThreadExample extends Thread{
    private char c;

    public ThreadExample(char c){
        this.c = c;
    }

    public void run(){
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++ ){
            System.out.print(c);
            if (i % c == 0)
                System.out.println();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadExempleRunable implements Runnable{
    private char c;

    public ThreadExempleRunable(char c){
        this.c = c;
    }

    public void run(){
        System.out.println("Thread executando: " + Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++ ) {
            System.out.print(c);
            if (i % c == 0)
                System.out.println();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            try {  //Faz com que separe em grupos as informações (SLEEP)
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}


public class ThreadsTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
//        ThreadExample t1 = new ThreadExample('A');
//        ThreadExample t2 = new ThreadExample('B');
//        ThreadExample t3 = new ThreadExample('C');
//        ThreadExample t4 = new ThreadExample('D');
//        t1.run();
//        t2.run();
//        t3.run();
//        t4.run();


        Thread t1 = new Thread(new ThreadExempleRunable('A'), "T1");
        Thread t2 = new Thread(new ThreadExempleRunable('B'), "T2");
        Thread t3 = new Thread(new ThreadExempleRunable('C'), "T3");
        Thread t4 = new Thread(new ThreadExempleRunable('D'), "T4");

        //Setando com maior prioridade, vai de 1 à 10
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t1.join();
        t2.start();
        t3.start();
        t4.start();
    }
}
