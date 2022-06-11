package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);

        Thread t1 = new Thread(new RemoveFromQueue(bq));

        bq.put("Guilherme");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        t1.start();
        bq.put("Bleyzer");
        System.out.println("Inserindo o ultimo valor");
    }

    static class RemoveFromQueue implements Runnable{
        private BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " " +
                    "entrando em espera por 2 segundos");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Removendo o valor: " + bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
