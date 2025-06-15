package org.example.streams;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Find the frequency of each character in a string using streams. If the maximum frequency is odd then print false; otherwise print true.
public class CharFreq {

    public static void main(String[] args) {

        String input = "Hello Worldl";
        boolean result = isMaxFrequencyEven(input);
        System.out.println("Is maximum frequency even? " + result); // Output: true
    }

    public static boolean isMaxFrequencyEven(String input) {
        /*return Stream.of(input.split(""))
                .mapToInt(s -> (int) input.chars().filter(c -> c == s.charAt(0)).count())
                .max()
                .orElse(0) % 2 == 0;*/

        IntStream stream = input.chars();
        Map<Character,Long> map = stream.mapToObj((c) -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean res = map.values().stream().max(Long::compare).orElse(0L) % 2== 0;
        return res;
    }
}
