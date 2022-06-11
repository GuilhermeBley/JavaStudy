package br.com.abc.javacore.ZZEconcurrent.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors()); //Mostra a quantia de Cores
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        threadPoolExecutor.setCorePoolSize(4);

        executorService.execute(new WorkerThreadExecutor("1"));
        executorService.execute(new WorkerThreadExecutor("2"));
        executorService.execute(new WorkerThreadExecutor("4"));
        executorService.execute(new WorkerThreadExecutor("5"));
        executorService.shutdown();

        System.out.println(executorService.isTerminated());
        System.out.println("Finalizado");
    }
}

class WorkerThreadExecutor implements Runnable{

    private String num;

    public WorkerThreadExecutor(String num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Iniciou "
                + num );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " Finalizou");
    }
}
