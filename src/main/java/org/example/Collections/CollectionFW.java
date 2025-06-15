package org.example.Collections;

import java.util.Vector;

public class CollectionFW {

    public static void main(String[] args) {
    Vector<Integer> vector = new Vector<>();

    vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Vector elements: " + vector);

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing an element
        vector.remove(1); // Removes the element at index 1
        System.out.println("After removing element at index 1: " + vector);

        // Size of the vector
        System.out.println("Size of the vector: " + vector.size());
    }




}
