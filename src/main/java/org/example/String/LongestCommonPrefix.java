package org.example.String;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] array) {

        Arrays.sort(array);
        String first = array[0];
        String last = array[array.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i=0;
        while(i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] array = {"flower", "flow", "flight"};
        String result = longestCommonPrefix.longestCommonPrefix(array);
        System.out.println("Longest Common Prefix: " + result); // Output: "fl"
    }
}
