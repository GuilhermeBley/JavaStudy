package br.com.abc.javacore.ZZLParallelStreams.clas;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExampleParallelStream {
    public static void main(String[] args) {
//        long num = 10_000_000; //Usar este com os sout comentados
        long num = 10_000_000_000L;

        System.out.println("Soma com For (for): "
                + sumFor(num) + " ms.");

        //System.out.println("Soma com Stream Iterate (Stream sequencial): "+ sumStreamIterate(num) + " ms.");

        //System.out.println("Soma com Stream Iterate Paralelo (Stream paralelo): "+ sumParallelelStreamIterate(num) + " ms.");

        System.out.println("Soma com LongStream (LongStream RangeClosed): "
                + sumRangeClosedStream(num) + " ms.");

        System.out.println("Soma com LongStream Parallel (LongStream RangeClosed Parallel): "
                + sumRangeClosedStreamParallel(num) + " ms.");
    }

    private static long sumFor(long num) {

        long result = 0;
        long init = System.currentTimeMillis();
        for (long index = 1L; index <= num; index++) {
            result += 1;
        }
        System.out.println("Result= " + result);
        long end = System.currentTimeMillis();
        return (end - init);
    }

    private static long sumStreamIterate(long num) {

        long result = 0;
        long init = System.currentTimeMillis();

        result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        System.out.println("Result= " + result);

        long end = System.currentTimeMillis();
        return (end - init);
    }

    private static long sumParallelelStreamIterate(long num) {

        long result = 0;
        long init = System.currentTimeMillis();

        result = Stream.iterate(1L, i -> i + 1).limit(num).parallel().reduce(0L, Long::sum);
        System.out.println("Result= " + result);

        long end = System.currentTimeMillis();
        return (end - init);
    }

    private static long sumRangeClosedStream(long num) {

        long result = 0;
        long init = System.currentTimeMillis();

        result = LongStream.rangeClosed(1L,num).reduce(0L,Long::sum);
        System.out.println("Result= " + result);

        long end = System.currentTimeMillis();
        return (end - init);
    }

    private static long sumRangeClosedStreamParallel(long num) {

        long result = 0;
        long init = System.currentTimeMillis();

        result = LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);
        System.out.println("Result= " + result);

        long end = System.currentTimeMillis();
        return (end - init);
    }
}
