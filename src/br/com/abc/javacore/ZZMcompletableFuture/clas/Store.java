package br.com.abc.javacore.ZZMcompletableFuture.clas;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Store {

    @Override
    public String toString() {
        return "Loja: " + this.name
                + " ......Preco: " + this.getPrice();
    }

    public double getPrice(){
        //Pegar o preço
        return calcPrice();
    }

    private String name;

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Store() {
    }

    public Future<Double> getPriceAsync(){
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();

        new Thread(() -> {
            try {
                futurePrice.complete(calcPrice());
            }
            catch (Exception e) {
                futurePrice.completeExceptionally(e);
            }
        }).start();

        return futurePrice;
    }

    public Future<Double> getPriceAsyncSupply(){

        return CompletableFuture.supplyAsync(this::calcPrice);
    }

    private double calcPrice(){
        delay();
        //int i = 1/0;
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    private void delay() {
        try{
            TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
