package org.example.Collections;

import java.util.PriorityQueue;

public class MaxPriorityQueueClass {

    // max priority queue used to solve problems of max heap
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((a,b) -> b-a);
        // Adding elements to the priority queue
        maxPQ.add(10);
        maxPQ.add(20);
        maxPQ.add(5);
        maxPQ.add(15);
        maxPQ.add(3);

        maxPQ.forEach(e ->
            System.out.println(e)
        );

        while (!maxPQ.isEmpty()) {
            int head = maxPQ.poll(); // Retrieves and removes the head of the queue
            System.out.println("Remove from top " + head);
        }
    }


}
