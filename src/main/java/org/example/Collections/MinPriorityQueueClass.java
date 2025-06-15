package org.example.Collections;

import java.util.PriorityQueue;


public class MinPriorityQueueClass {

    public static void main(String[] args) {

        // Creating a min-priority queue, used to solve problems of min heap
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        // Adding elements to the priority queue
        minPQ.add(10);
        minPQ.add(20);
        minPQ.add(5);
        minPQ.add(15);
        minPQ.add(30);

        minPQ.forEach(element ->
            System.out.println(element)
        );

        while (!minPQ.isEmpty()){
            int head = minPQ.poll(); // Retrieves and removes the head of the queue
            System.out.println("Remove from top " + head);
        }

        minPQ.forEach(
            element -> System.out.println("After removing all elements: " + element)
        );

    }
}
