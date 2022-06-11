package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.concurrent.*;

public class CallableTest implements Callable<String> {
    public static void main(String[] args) {
        CallableTest callableTest = new CallableTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> resultFuture = executorService.submit(callableTest);

        try {
            String s = resultFuture.get();
            System.out.println(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1,11);
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + " executando...");
        }

        return "Trabalhando finalizando o numero aleatorio é: " + count;
    }
}
