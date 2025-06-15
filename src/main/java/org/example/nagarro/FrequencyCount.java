package org.example.nagarro;

public class FrequencyCount {

    public String frequencyCount(String input) {
        StringBuilder result = new StringBuilder();
        int[] frequency = new int[256]; // Assuming ASCII characters
        for(char c : input.toCharArray()) {
            frequency[c]++;
        }
        for(int i = 0; i < frequency.length; i++) {
            if(frequency[i] > 0) {
                result.append((char)i).append(frequency[i]);
            }
        }
        return result.toString();
    }

    public static void main(String [] args) {

        String input = "babdc";
        FrequencyCount frequencyCount = new FrequencyCount();
        String result = frequencyCount.frequencyCount(input);
        System.out.println("Frequency count of characters in the string: " + result);
    }
}
