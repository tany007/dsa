package org.example.common;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.util.ArrayList");
        System.out.println("Class Name: " + clazz.getSuperclass().getName());
        System.out.println("Class Name: " + clazz.arrayType());
    }
}
