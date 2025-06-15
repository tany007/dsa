package org.example.Collections;

/* Example for custom usage of PriorityQueue */

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class BankEvent {
    String eventId;
    String customerId;
    String eventType;
    int customerTier;
    long timestamp;

    public BankEvent() {
        // Default constructor
    }

    public BankEvent(String eventId, String customerId, String eventType, int customerTier, long timestamp) {
        this.eventId = eventId;
        this.customerId = customerId;
        this.eventType = eventType;
        this.customerTier = customerTier;
        this.timestamp = timestamp;
    }

    // Priority of event types
    Map<String, Integer> eventPriority = Map.of(
        "DEPOSIT", 1,
        "WITHDRAWAL", 2,
        "TRANSFER", 3,
        "LOAN", 4
    );

    Comparator<BankEvent> eventComparator = (e1, e2) -> {
        if(e1.customerTier != e2.customerTier) {
            return Integer.compare(e2.customerTier, e1.customerTier);
           // return e2.customerTier - e1.customerTier; // Higher tier first
        }
        if(e1.eventType.equals(e2.eventType)) {
            return Integer.compare(eventPriority.getOrDefault(e2.eventType, 0),
                    eventPriority.getOrDefault(e1.eventType, 0));
        }
        return Long.compare(e1.timestamp, e2.timestamp); // Older first
    };

    PriorityQueue<BankEvent> priorityQueue = new PriorityQueue<>(eventComparator);
 //   PriorityBlockingQueue<BankEvent> priorityBlockingQueue = new PriorityBlockingQueue<>(11, eventComparator); // for thread-safe operations
    public void addEvent(BankEvent event) {
        priorityQueue.add(event);
    }

    public BankEvent processNextEvent() {
        return priorityQueue.poll(); // Retrieves and removes the highest priority event
    }

    public static void main(String[] args) {
        List<BankEvent> events = List.of(
            new BankEvent("1", "C123", "DEPOSIT", 2, System.currentTimeMillis()),
            new BankEvent("2", "C456", "WITHDRAWAL", 1, System.currentTimeMillis() + 1000),
            new BankEvent("3", "C789", "TRANSFER", 3, System.currentTimeMillis() + 2000),
            new BankEvent("4", "C123", "LOAN", 2, System.currentTimeMillis() + 3000)
        );

        BankEvent bankEvent = new BankEvent();
        for (BankEvent event : events) {
            bankEvent.addEvent(event);
        }

        /*BankEvent bankEvent = new BankEvent("1", "C123", "DEPOSIT", 2, System.currentTimeMillis());
        bankEvent.addEvent(bankEvent);*/

        // Process events based on priority
        while (!bankEvent.priorityQueue.isEmpty()) {
            BankEvent nextEvent = bankEvent.processNextEvent();
            System.out.println("Processing event: " + nextEvent.eventId + " for customer: " + nextEvent.customerId +
                               " with type: " + nextEvent.eventType +
                               " at timestamp: " + nextEvent.timestamp +
                               " with tier: " + nextEvent.customerTier);
        };
    }

}
