package org.example.venkatsubra;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {

    List<Integer> list = Arrays.asList(2, 4, 6, 7);

        int result = list.stream().reduce(0, Integer::sum);
        System.out.println(result);

    }
}
