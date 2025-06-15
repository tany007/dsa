package org.example.recursion;

import java.util.Stack;

public class DeleteMiddleElementStack {

    public Stack<Integer> middleDelete(Stack<Integer> stack) {
        int size = stack.size();
        int k = size / 2 + 1;

        if(size == 0) {
            return stack;
        }
        solve(stack, k);
        return stack;
    }

    private void solve(Stack<Integer> stack, int k) {

        if(k == 1) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        solve((stack), k - 1);
        stack.push(temp);
        return;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(0);
        stack.push(10);

        DeleteMiddleElementStack deleteMiddleElementStack = new DeleteMiddleElementStack();
        deleteMiddleElementStack.middleDelete(stack);

        System.out.println("Stack after deleting middle element: " + stack);
        deleteMiddleElementStack.middleDelete(stack);

        System.out.println("Stack after deleting middle element: " + stack);
    }
}
