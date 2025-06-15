package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class AvgAgeOfPerson {

    public static void main(String[] args) {

    List<Person> persons = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35),
            new Person("Diana", 28)
    );

    double avgAge = persons.stream().mapToInt(Person::getAge)
            .average()
            .orElse(0);

    System.out.println("Average age of persons: "+avgAge);
}

    public static class Person {
        private String name;
        private int age;

        public Person() {
            // TODO Auto-generated constructor stub
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }


    }
}
