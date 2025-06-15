package org.example.common;

/**
 * This is an example of polymorphism in Java.
 * It demonstrates how the same method can behave differently based on the object type passed to it.
 */
public class PolymorphismExample {
    public static void main(String[] args) {
        printObject("Hello, World!"); // String
        printObject(123);            // Integer
        printObject(45.67);          // Double
        printObject(3.4f);          // Float
        printObject('A');            // Character
        printObject(true);           // Boolean
        printObject(new Object());   // Unknown type
    }

    public static void printObject(Object obj) {
        if (obj instanceof String) {
            System.out.println("String: " + obj);
        } else if (obj instanceof Integer) {
            System.out.println("Integer: " + obj);
        } else if (obj instanceof Double) {
            System.out.println("Double: " + obj);
        } else if (obj instanceof Float) {
            System.out.println("Float: " + obj);
        } else if (obj instanceof Character) {
            System.out.println("Character: " + obj);
        } else if (obj instanceof Boolean) {
            System.out.println("Boolean: " + obj);
        }
        else {
            System.out.println("Unknown type: " + obj);
        }
    }
}
