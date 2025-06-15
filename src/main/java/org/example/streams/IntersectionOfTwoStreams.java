package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoStreams {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        List<Integer> intersection = list1.stream().filter(list2::contains)
                                           .toList();

        System.out.println("Intersection of the two lists: " + intersection);
    }
}
