package org.example.SlidingWindow;

public class MaxSumSubArraySizeK {

    public static void main(String[] args) {
        int i=0, j=0;
        int sum = 0,  maxSum = Integer.MIN_VALUE;
        int[] arr = {2, 1, 5, 1, 3, 2};

        int k = 3; // Size of the subarray

        while(j<arr.length) {

            sum = sum + arr[j]; // Add the current element to the sum
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k) {
                maxSum = Math.max(maxSum, sum); // Update maxSum if the current sum is greater
                sum = sum - arr[i]; // Subtract the element going out of the window
                i++; // Move the start of the window forward
                j++; // Move the end of the window forward
            }
        }
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);


    }
}
