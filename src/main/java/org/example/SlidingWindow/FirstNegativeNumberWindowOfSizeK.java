package org.example.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberWindowOfSizeK {
    private static int[] firstNegativeNumber(int[] arr, int k) {

        int size = arr.length;
        List<Integer> negativeIndices = new ArrayList<>();
        int j=0,i=0;
        List<Integer> result = new java.util.ArrayList<>();

        while(j<size){
            if(arr[j] < 0){
                negativeIndices.add(arr[j]);
            }
            if(j-i+1 < k) {
                j++;
            }
            else if(j-i+1 ==k){
                if (negativeIndices.isEmpty())
                    result.add(0);
                else {
                    result.add(negativeIndices.get(0)); // Add the first negative number in the current window
                    if (arr[i] == negativeIndices.get(0)) {
                        negativeIndices.remove(0); // Remove the index if it is the first negative number in the current window
                    }
                }
                i++;
                j++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] result = firstNegativeNumber(arr, k);

        System.out.print("First negative numbers in each window: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
