package br.com.abc.javacore.ZZMcompletableFuture.clas;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Discount {
    public static enum Code {
        NENHUM(0), SILVER(5), GOLD(10), PLATINIUM(15), ELITE(20);
        private final int percent;

        Code(int percent) {
            this.percent = percent;
        }

        public int getPercent() {
            return percent;
        }
    }

    public static String calcDiscount (Estimate estimate){
        return String.format("%s Preco original %.2f ,   tem o desconto de: %.2f  e o preco final eh: %.2f\n"
                , estimate.getNameStore()
                , estimate.getPrice()
                , estimate.getCode().getPercent() * estimate.getPrice() / 100
                , calc(estimate.getPrice(), estimate.getCode()));
    }

    private static double calc(double price, Code code){
        delay();
        return  price * (100 - code.percent) / 100;
    }

//    private static double calc(double price){
//        delay();
//        return  price;
//    }

    private static void delay() {
        try{
            int delay = ThreadLocalRandom.current().nextInt(500,2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
