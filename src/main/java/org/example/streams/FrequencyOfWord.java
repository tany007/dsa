package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfWord {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "apple"
        );

        Map<String, Long> frequencyMap = words.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));
        frequencyMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
        forEach(e -> System.out.println("Word: " + e.getKey() + ", Frequency: " + e.getValue()));
        }
    }
