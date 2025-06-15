package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamInterviewQuestions {

    public static void main(String[] args) {

        /* Print Stream Twice? Not possible */
        Stream  stream = Stream.of("Hello", "World", "Java", "Streams");
        stream.forEach(System.out::println);
      //  stream.forEach(System.out::println);  // Throws IllegalStateException: stream has already been operated upon or closed

        /* Difference between findFirst() and findAny() */
        //In a non-parallel operation, findAny() will most likely return the first element in the Stream, but there is no guarantee for this.
        List<String> list = Arrays.asList("A","B","C","D");
        Optional<String> result = list.stream().findAny();
        result.ifPresent(System.out::println); // Prints any element from the list


    }


}
