package org.example.recursion;

import java.util.Stack;

public class ReverseStack {

    public void reverse(Stack<Integer> stack) {
        if(stack.size()==1){
            return;
        }

        int temp = stack.pop();
        reverse(stack);
        insertAtBottom(stack, temp);
        return;
    }

    private void insertAtBottom(Stack<Integer> stack, int temp) {

        if(stack.isEmpty()) {
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        insertAtBottom(stack, temp);
        stack.push(val);
        return;
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

        ReverseStack reverseStack = new ReverseStack();
        reverseStack.reverse(stack);

        System.out.println("Reversed stack: " + stack);
    }
}
