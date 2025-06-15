package org.example.common;

public class ObjectComparison {

    int a ;
    ObjectComparison(int a){
        this.a = a;
    }
    void getA() {}

    @Override
    public boolean equals(Object obj) {

        ObjectComparison objectComparison = (ObjectComparison) obj;
        return this.a == objectComparison.a;

    }

    public static void main(String[] args) {
        ObjectComparison objectComparison1 = new ObjectComparison(10);
        ObjectComparison objectComparison2 = new ObjectComparison(10);
        System.out.println(objectComparison1.equals(objectComparison2)); // true
        System.out.println(objectComparison1 == (objectComparison2));
    }

}
