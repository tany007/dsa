package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateVsFunction {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Example 1: Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");

        System.out.println("startsWithA : "+ startsWithA.test("Alice")); // Output: true

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames); // Output: [Alice]

        // Example 2: Function
        Function<String, Integer> lengthFunction = name -> name.length();

        System.out.println("lengthFunction : "+ lengthFunction.apply("Alice")); // Output: 5

        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(nameLengths); // Output: [5, 3, 7, 5, 3]
    }
}
