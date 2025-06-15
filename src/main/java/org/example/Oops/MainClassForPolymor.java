package org.example.Oops;

public class MainClassForPolymor {

    public static void main(String[] args) {
        ParentClassForPolymor parentClassForPolymor = new ParentClassForPolymor();
        ChildClassForPolymor childClassForPolymor = new ChildClassForPolymor();

        //Dynamic binding (runtime polymorphism)
        ParentClassForPolymor polymorphicReference ;

        polymorphicReference = new ChildClassForPolymor();
        polymorphicReference.func(20); // Calls ChildClassForPolymor's func()

        parentClassForPolymor.func();
        parentClassForPolymor.func(10);


    }
}
