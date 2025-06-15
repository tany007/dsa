package org.example.Oops;

public abstract class SubClass extends AbstractClass {

    public abstract void show();

    public void printing() {
        System.out.println("This is a concrete method in the subclass.");
    }

    // Overriding the add method from AbstractClass
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        SubClass obj = new SubClass() {
            @Override
            public void display() {
                System.out.println("This is an implementation of the abstract method in an anonymous class.");
            }

            @Override
            public void show() {
                System.out.println("This is an implementation of the show method in an anonymous class.");
            }
        };

        obj.display();
        obj.show();
        obj.printing();
        System.out.println("Sum: " + obj.add(5, 10));
        // Note: The add method is inherited from AbstractClass
        obj.print();
        System.out.println("Sum from SubClass: " + obj.add(5.5, 10.5));

    }
}
