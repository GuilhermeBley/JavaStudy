package br.com.abc.javacore.ZZMcompletableFuture.test;

import br.com.abc.javacore.ZZMcompletableFuture.clas.Store;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ExecutorsTest {

    public static void main(String[] args) {
        List<Store> storeList = asList(new Store("americanas"),
                new Store("casasBahia"),
                new Store("bondedosJurupara"),
                new Store("neoCup"),
                new Store("Magazine"),
                new Store("Lojas cem"),
                new Store("Umicore"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Plam"),
                new Store("Esprom"),
                new Store("Vesuvius"));

//        findPrice(storeList);
//        findPriceParallel(storeList);
//        findPriceCompletableFutureSeq(storeList);
//        findPriceCompletableFuture(storeList);

        final Executor executor = Executors.newFixedThreadPool(storeList.size(), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });

        System.out.println("Size List -> " + storeList.size());
        System.out.println("Quantia de processadores -> "+ Runtime.getRuntime().availableProcessors());
        findPriceCompletableFutureExecutor(storeList, executor);
    }

    private static List<String> findPriceCompletableFutureExecutor(List<Store> storeList, Executor executor){
        System.out.println("\nCompletable Future Sequencial");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> futurePrice = storeList.stream()
                .map(store -> CompletableFuture
                        .supplyAsync(()-> String.format("%s o preco eh: %.2f\n", store.getName(), store.getPrice()), executor
                ))
                .collect(Collectors.toList());

        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start));

        List<String> collect = futurePrice.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println("Tempo total: " + (System.currentTimeMillis() - start));
        System.out.println(collect);

        return collect;
    }
}
