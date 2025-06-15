package org.example.recursion;

public class PrintSubsets {

    //input = "abc"
    //output = [] [c] [b] [bc] [a] [ac] [ab] [abc]
    private static void printSubsets(String input, String output) {
        if(input.isEmpty()) {
            System.out.print("[" + output + "] ");
            return;
        }
        String output1 = output;
        String output2 = output;

        output2 += input.charAt(0); // Include the first character
        input = input.substring(1); // Exclude the first character
        printSubsets(input, output1); // Exclude the first character
        printSubsets(input, output2); // Include the first character

        // add the first character of input to output

        // Exclude the first character
       /* printSubsets(input.substring(1), output); */
        //printSubsets(bc," ")

        // Include the first character
      /*  printSubsets(input.substring(1), output + input.charAt(0)); */
        //printSubsets(bc," "+a)

    }

    public static void main(String[] args) {
        String input = "abc";
        String output = "";
        System.out.println("Input: " + input.charAt(0));
        System.out.println("Input2: " + input.substring(1));
       // int n = arr.length;
        printSubsets(input, output);
    }




}
