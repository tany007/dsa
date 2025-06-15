package org.example.recursion;

public class LetterCasePermutation {

    public void solve(String input, String output) {
        if(input.isEmpty()) {
            System.out.print("[" + output + "] ");
            return;
        }
        String op1 = output;
        String op2 = output;

        op1+= Character.toUpperCase(input.charAt(0));
        op2+= Character.toLowerCase(input.charAt(0));


        input = input.substring(1);
        solve(input, op1);
        solve(input, op2);
    }

    public static void main(String[] args) {
        String input = "a1b2";
        String output = "";
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        letterCasePermutation.solve(input, output);
    }
}
