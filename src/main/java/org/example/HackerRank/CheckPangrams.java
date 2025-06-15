package org.example.HackerRank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckPangrams {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        Set<Character> set = new HashSet<>();
        s = s.toLowerCase().replace(" ", "");
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        String input = "We promptly judged antique ivory buckles for the prize";
        String result = pangrams(input);
        System.out.println("Is pangram: " + result); // Output: "pangram"
    }
}
