package org.example.Oops;

public abstract class AbstractClass {

    // Abstract method with no body
    public abstract void display();

    // Concrete method with a body
    public int add(int a, int b) {
        return a + b;
    }

    // Another concrete method
    public void print() {
        System.out.println("This is a concrete method in an abstract class.");
    }

    public static void main(String[] args) {
        // Cannot instantiate an abstract class directly

        AbstractClass obj = new AbstractClass() {
            @Override
            public void display() {
                System.out.println("This is an implementation of the abstract method in an anonymous class.");
            }
        };

        obj.display();
        System.out.println("Sum: " + obj.add(5, 10));
        obj.print();
    }
}
