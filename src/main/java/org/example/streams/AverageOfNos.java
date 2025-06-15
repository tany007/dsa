package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfNos {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 7);

        OptionalDouble optionalDouble = list.stream().mapToInt(Integer::intValue)
                .average();
        System.out.println(optionalDouble);

    }
}
