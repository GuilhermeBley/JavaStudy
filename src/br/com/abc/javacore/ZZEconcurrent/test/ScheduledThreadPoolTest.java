package br.com.abc.javacore.ZZEconcurrent.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {
    public static void main(String[] args) {
        beep();
    }

    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
    public static void beep(){
        final Runnable beeper = new Runnable() {
            @Override
            public void run() {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date())+ " beep");
            }
        };
        scheduledExecutorService.scheduleAtFixedRate(beeper, 1, 5, TimeUnit.SECONDS);


        final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(beeper, 1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Cancelando");
                scheduledFuture.cancel(false);
//                scheduledExecutorService.shutdown();

            }
        },10, TimeUnit.SECONDS);

    }

}

