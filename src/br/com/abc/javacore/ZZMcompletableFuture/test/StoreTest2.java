package br.com.abc.javacore.ZZMcompletableFuture.test;

import br.com.abc.javacore.ZZMcompletableFuture.clas.Store;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StoreTest2 {
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
                new Store("Vesuvius"));

        findPrice(storeList);
        findPriceParallel(storeList);
        findPriceCompletableFutureSeq(storeList);
        findPriceCompletableFuture(storeList);
    }

    private static List<String> findPrice(List<Store> storeList){
        System.out.println("Stream Sequencial");
        long start = System.currentTimeMillis();
        List<String> collect = storeList.stream()
                .map(store -> String.format("%s o preco eh: %.2f\n", store.getName(), store.getPrice()))
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("Tempo: " + (System.currentTimeMillis() - start));
        return collect;
    }

    private static List<String> findPriceParallel(List<Store> storeList){
        System.out.println("\nStream Parallel");
        long start = System.currentTimeMillis();
        List<String> collect = storeList.parallelStream()
                .map(store -> String.format("%s o preco eh: %.2f\n", store.getName(), store.getPrice()))
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("Tempo: " + (System.currentTimeMillis() - start));
        return collect;
    }

    private static List<String> findPriceCompletableFutureSeq(List<Store> storeList){
        System.out.println("\nCompletable Future Sequencial");
        long start = System.currentTimeMillis();

        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start));

        List<String> collect = storeList.stream()
                .map(store -> CompletableFuture.supplyAsync(
                        ()-> String.format("%s o preco eh: %.2f\n", store.getName(), store.getPrice())
                )).map(CompletableFuture::join)
                .collect(Collectors.toList());


        System.out.println("Tempo total: " + (System.currentTimeMillis() - start));
        System.out.println(collect);

        return collect;
    }

    private static List<String> findPriceCompletableFuture(List<Store> storeList){
        System.out.println("\nCompletable Future Sequencial");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> futurePrice = storeList.stream()
                .map(store -> CompletableFuture.supplyAsync(
                        ()-> String.format("%s o preco eh: %.2f\n", store.getName(), store.getPrice())
                ))
                .collect(Collectors.toList());

        System.out.println("Tempo de invocação: " + (System.currentTimeMillis() - start));

        List<String> collect = futurePrice.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println("Tempo total: " + (System.currentTimeMillis() - start));
        System.out.println(collect);

        return collect;
    }
}
