package br.com.abc.javacore.ZZKstreams.test;


import javafx.scene.shape.Path;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GeneratingStreamTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(s -> System.out.print(s + " "));

        Stream<String> stringStream = Stream.of("Bley", "Ola", "Muito bom", "Bora la");
        System.out.println("\n\n");
        stringStream.map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        Stream<String> stringEmpty = Stream.empty();

        int nums[] = {1, 2, 3, 4, 5, 6};
        OptionalDouble average = Arrays.stream(nums).average();
        System.out.println("\n" + average.getAsDouble());

        try (Stream<String> lines = Files.lines(Paths.get("Folder2/test.txt"), Charset.defaultCharset())) {
            lines.flatMap(line -> Arrays.stream(line.split("\n")))
                    .filter(p -> p.contains("File"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Stream.iterate(1, n -> n + 2)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n\nFibonati:");
        Stream.iterate(new int[]{0,1},  a -> new int[]{a[1], a[0] + a[1]})
                .limit(30)
                .map(t-> t[0])
                .forEach(System.out::println);


        System.out.println("\nValores aleatórios");
//        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        ThreadLocalRandom t = ThreadLocalRandom.current();
        Stream.generate(()-> t.nextInt(1,100)).limit(10).forEach(System.out::println);
    }
}
