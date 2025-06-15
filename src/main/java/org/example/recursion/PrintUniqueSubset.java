package org.example.recursion;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueSubset {

    Map<String, Integer> map = new HashMap<>();

    // Input: "aab"
    // Output: [][aa][a][ab][b][aab]
    public void UniqueSubset(String input, String output){

        if(input.isEmpty()){
           // map.put(output, map.getOrDefault(output, 0) + 1);
            map.put(output, map.getOrDefault(output, 0) + 1);
            return;
        }
        /*UniqueSubset(input.substring(1), output);
        UniqueSubset(input.substring(1), output + input.charAt(0));*/

        String output1 = output;
        String output2 = output;
        output2 += input.charAt(0); // Include the first character
        input = input.substring(1); // Exclude the first character
        UniqueSubset(input, output1); // Exclude the first character
        UniqueSubset(input, output2); // Include the first character
    }


    public void printMap() {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print("[" + entry.getKey() + "]");
        }
    }

    public static void main(String[] args) {
        String input = "aab";
        String output = "";
        PrintUniqueSubset printUniqueSubset = new PrintUniqueSubset();
        printUniqueSubset.UniqueSubset(input, output);
        printUniqueSubset.printMap();
    }
}
