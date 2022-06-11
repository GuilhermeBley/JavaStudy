package br.com.abc.javacore.ZZMcompletableFuture.test;

import br.com.abc.javacore.ZZMcompletableFuture.clas.Discount;
import br.com.abc.javacore.ZZMcompletableFuture.clas.Estimate;
import br.com.abc.javacore.ZZMcompletableFuture.clas.NewStore;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewStoreTest {
    public static void main(String[] args) {
        List<NewStore> store = NewStore.importList();
//        strore.stream().forEach(newStore -> System.out.println(newStore.getPrice()));

        final Executor executor = Executors.newFixedThreadPool(Math.min(store.size(), 100), r -> {
            Thread t = new Thread(r);
            t.setDaemon(true);
            return t;
        });


//        findPrice(store);

//        findPriceSupplyAsync(store, executor);

        long start = System.currentTimeMillis();


        CompletableFuture[] completableFutures = findPriceStream(store, executor)
                .map(f -> f.thenAccept(s -> System.out.println(s + "(finalizado em:" +
                        (System.currentTimeMillis() - start) + ")")))
                .toArray(CompletableFuture[]::new);
        CompletableFuture.allOf(completableFutures).join();

        System.out.println("Tempo de todas as lojas finalizados em: " + (System.currentTimeMillis() - start));
    }

    private static List<String> findPrice(List<NewStore> storeList){
        System.out.println("Stream Sequencial");
        long start = System.currentTimeMillis();

        List<String> collect = storeList.stream().map(NewStore::getPrice)
                .map(Estimate::parse)
                .map(Discount::calcDiscount)
                .collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("Tempo: " + (System.currentTimeMillis() - start));
        return collect;
    }

    private static List<String> findPriceSupplyAsync(List<NewStore> storeList, Executor executor){
        System.out.println("Complete Future Async");
        long start = System.currentTimeMillis();

        List<CompletableFuture<String>> completableFutures = storeList.stream()
                //Pegando o preco original de forma Async
                .map(store -> CompletableFuture.supplyAsync(store::getPrice, executor))
                //Transforma a String em um Estimate no momento em que ele se torna disponível
                .map(future -> future.thenApply(Estimate::parse))
                //Compõem o primeiro future com mais uma camada Async,
                //Para pergar a primeira requisicao assim que ela estiver disponível
                .map(future -> future.thenCompose(estimate ->
                        CompletableFuture.supplyAsync(() -> Discount.calcDiscount(estimate), executor)))
                .collect(Collectors.toList());

        //Transformando o completebleFuture em List<String>
        //Espera todos os futures no stream finalizarem para terem seus resultados extraídos
        List<String> collect = completableFutures.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());


        System.out.println(collect);
        System.out.println("Tempo: " + (System.currentTimeMillis() - start));
        return collect;
    }

    //Resultados dinâmicos
    private static Stream<CompletableFuture<String>> findPriceStream(List<NewStore> storeList, Executor executor){
        System.out.println("Complete Future Async Stream");
        long start = System.currentTimeMillis();

        Stream<CompletableFuture<String>> completableFutureStream = storeList.stream()
                .map(store -> CompletableFuture.supplyAsync(store::getPrice, executor))
                .map(future -> future.thenApply(Estimate::parse))
                .map(future -> future.thenCompose(estimate ->
                        CompletableFuture.supplyAsync(() -> Discount.calcDiscount(estimate), executor)));

        System.out.println("Tempo: " + (System.currentTimeMillis() - start));
        return completableFutureStream;
    }
}
