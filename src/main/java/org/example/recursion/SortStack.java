package org.example.recursion;

import java.util.Stack;

public class SortStack {

    public void sortStack(Stack<Integer> stack) {
        if (stack.size()==1)
            return;
        int temp = stack.pop();
        sortStack(stack);
        insertSorted(stack, temp);
    }

    private void insertSorted(Stack<Integer> stack, int temp) {

        if(stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insertSorted(stack, temp);
        stack.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(0);
        stack.push(10);

        SortStack sortStack = new SortStack();
        sortStack.sortStack(stack);

        System.out.println("Sorted stack: " + stack);
    }
}
