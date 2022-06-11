package br.com.abc.javacore.ZZMcompletableFuture.test;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.concurrent.*;

public class FutureTest {
    private static final ExecutorService serviceExecutor = Executors.newFixedThreadPool(1);

    public static void main(String[] args) {
        Future<Double> future = serviceExecutor.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return 2000D;
            }
        });
        enrolando();
        try {
            Double tempFuture = future.get(10, TimeUnit.SECONDS);
            System.out.println("tempo: " + tempFuture);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }finally {
            serviceExecutor.shutdown();
        }
    }

    public static void enrolando(){
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++){
            sum += 1;
        }
        System.out.println(sum);
    }
}
