package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        //Colocar os valores
        System.out.println(tq.remainingCapacity());
        System.out.println(tq.add("Gui"));
        tq.put("Bley");
        System.out.println(tq.offer("EAE"));
        System.out.println(tq.offer("Guilherme", 1, TimeUnit.SECONDS));
        System.out.println(tq.tryTransfer("Watching DevDojo"));

        System.out.println(tq.remainingCapacity());

        //Pegar os valores
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(1, TimeUnit.SECONDS));


    }
}
