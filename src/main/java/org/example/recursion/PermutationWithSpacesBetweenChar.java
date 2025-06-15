package org.example.recursion;

public class PermutationWithSpacesBetweenChar {

    void solveFirstChar(String input, String output) {
        output += input.charAt(0);
        input = input.substring(1);
        solve(input, output);
    }

    private void solve(String input, String output) {
        if(input.isEmpty()) {
            System.out.print("["+output +"]" +" ");
            return;
        }
        String output1 = output;
        String output2 = output;

        output1 += ' ';
        output1 += input.charAt(0);
        output2 += input.charAt(0);

        input = input.substring(1);

        solve(input, output1);
        solve(input, output2);
        return;
    }

    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        PermutationWithSpacesBetweenChar permutationWithSpaces = new PermutationWithSpacesBetweenChar();
        permutationWithSpaces.solveFirstChar(input, output);
    }
}
