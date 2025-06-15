package org.example.common;

public class StringVsStringBuilder {

    public static void main(String... args) {
        int iterations = 100000;
        String str = "";

        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            str += "Hello";
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("String concatenation took: " + duration + " nanoseconds");

        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("Hello");
        }
        endTime = System.nanoTime();
        long duration1 = endTime - startTime;
        System.out.println("StringBuilder concatenation took: " + duration1 + " nanoseconds");

        //performance comparison
        System.out.println("StringBuilder is " + (double) duration / duration1  + " times faster than StringBuilder concatenation.");
    }
}
