package org.example.LinkedList;

public class DoublyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public void insertAtBeginning(int new_data) {
        Node new_node= new Node(new_data);

        new_node.next = head;
        new_node.prev = null;

        if(head!=null)
            head.prev = new_node;

        head = new_node;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.head = new Node(0);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);

        dll.head.next = second;
        second.prev = dll.head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = null;

        System.out.println("Doubly linked list:");
        dll.printList();
        dll.insertAtBeginning(5);
        dll.printList();


    }

}
