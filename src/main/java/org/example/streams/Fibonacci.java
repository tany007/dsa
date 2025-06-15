package org.example.streams;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream<Long> fibonacci = Stream.iterate(
                new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
                .map(f -> f[0]);
        fibonacci.limit(10).forEach(System.out::println);

    }
}
