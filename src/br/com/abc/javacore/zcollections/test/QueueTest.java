package br.com.abc.javacore.zcollections.test;

import br.com.abc.javacore.zcollections.clas.Consumer;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        /**
        Queue<Consumer> queue = new PriorityQueue<>();

        Consumer consumer = new Consumer("Guilherme Bley", "123");
        Consumer consumer2 = new Consumer("Tapeçaria Bley", "321");

        queue.add(consumer);
        queue.add(consumer2);

        System.out.println(queue);
         */

        Queue<String> queue = new PriorityQueue<>();

        queue.add("c");
        queue.add("b");
        queue.add("d");
        queue.add("a");

        System.out.println(queue.peek());

    }
}
