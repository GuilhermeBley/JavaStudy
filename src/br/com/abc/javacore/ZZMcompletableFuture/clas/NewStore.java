package br.com.abc.javacore.ZZMcompletableFuture.clas;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static java.util.Arrays.asList;

public class NewStore {

    @Override
    public String toString() {
        return "Loja: " + this.name
                + " ......Preco: " + this.getPrice();
    }

    //NomeDaLoja:Preco:CodigoDeDesconto
    public String getPrice(){
        double price = calcPrice();
        Discount.Code code = Discount.Code.values()[//Retorna Um array o .VALUES
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return String.format("%s:%.2f:%s", name, price, code);
    }

    private String name;

    public NewStore(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public NewStore() {
    }


    private double calcPrice(){
        delay();
        return ThreadLocalRandom.current().nextDouble() * 100;
    }

    public static List<NewStore> importList(){
        return asList(
                new NewStore("americanas"),
                new NewStore("casasBahia"),
                new NewStore("bondedosJurupara"),
                new NewStore("Magazine"),
                new NewStore("neoCup"),
                new NewStore("Lojas cem"),
                new NewStore("Umicore"),
                new NewStore("Plam"),
                new NewStore("Esprom"));
    }

    private static void delay() {
        try{
            int delay = ThreadLocalRandom.current().nextInt(500,2000);
            TimeUnit.MILLISECONDS.sleep(delay);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}
