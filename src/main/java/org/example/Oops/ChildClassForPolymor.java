package org.example.Oops;

public class ChildClassForPolymor extends ParentClassForPolymor{

    @Override
    public void func() {
        System.out.println("Child.func()");
    }

    @Override
    public void func(int a) {
        super.func(a);
        System.out.println("Child.func(int): " + a);
    }
}
