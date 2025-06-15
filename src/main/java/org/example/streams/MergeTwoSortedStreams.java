package org.example.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoSortedStreams {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(10, 3, 5, 7);
        List<Integer> list2 = List.of(2, 14, 16, 8);

        List<Integer> mergeList = Stream.concat(list1.stream(), list2.stream()).sorted().toList();

        System.out.println("Merged and sorted list: " + mergeList);
    }
}
