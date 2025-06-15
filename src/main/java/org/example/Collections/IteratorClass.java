package org.example.Collections;

public class IteratorClass {

    public static void main(String[] args) {
        // Example usage of an iterator
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        java.util.Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
