package br.com.abc.javacore.ZZMcompletableFuture.test;

import br.com.abc.javacore.ZZMcompletableFuture.clas.Store;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class StoreTest {
    public static void main(String[] args) {
        Store americanas = new Store();
        Store casasBahia = new Store();
        Store bondedosJurupara = new Store();
        Store neoCup = new Store();

        long start = System.currentTimeMillis();

        /**Usando Threads

        System.out.println(americanas.getPrice());
        System.out.println(casasBahia.getPrice());
        System.out.println(bondedosJurupara.getPrice());
        System.out.println(neoCup.getPrice());

        System.out.println(System.currentTimeMillis() - start);
        */

/**Método Suplly pega a exception, sem precisar do Try Catch
        Future<Double> precoAsync1 = americanas.getPriceAsync();
        Future<Double> precoAsync2 = casasBahia.getPriceAsync();
        Future<Double> precoAsync3 = bondedosJurupara.getPriceAsync();
        Future<Double> precoAsync4 = neoCup.getPriceAsync();
*/

        Future<Double> precoAsync1 = americanas.getPriceAsyncSupply();
        Future<Double> precoAsync2 = casasBahia.getPriceAsyncSupply();
        Future<Double> precoAsync3 = bondedosJurupara.getPriceAsyncSupply();
        Future<Double> precoAsync4 = neoCup.getPriceAsyncSupply();


        long end = System.currentTimeMillis();
        System.out.println("Criação de Futures: " + (end-start) + " ms");

        enrolando();

        //Invés de colocar um time na Thread, use o completeExceptionally

        try {
            System.out.println("americanas =  " + precoAsync1.get() +"\n"+
                    "casasBahia =  " + precoAsync2.get()
                    + "\nbondedosJurupara =  " + precoAsync3.get() +
                    "\nneoCup =  " + precoAsync4.get());
        } catch (InterruptedException | ExecutionException  e) {
            e.printStackTrace();
        }

        System.out.println("TEMP de execução Future (get): " + (end - start) + " ms");


    }

    public static void enrolando(){
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++){
            sum += 1;
        }
        System.out.println(sum);
    }
}
