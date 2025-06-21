package org.example.Arrays;

import java.util.HashMap;

public class SubArraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int n = nums.length;
        int len = 0;
        // Brute force approach
        /*for(int i=0;i<n;i++) {
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                if(sum == k){
                    len = Math.max(len,j-i+1);
                }
            }
        }*/

        // Using a prefix sum and a hashmap to store the frequency of sums
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
            System.out.print("Prefix Sum[" + (i + 1) + "] = " + prefixSum[i + 1] + ",");
        }
        System.out.println();
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            int currentSum = prefixSum[i];
            // Check if there is a previous sum that can form the required sum k
            if (sumMap.containsKey(currentSum - k)) {
                System.out.println("Length = "+ len + " Current Sum = " + currentSum + " Index = " + i);
                len = Math.max(len, i - sumMap.get(currentSum - k));
              //  System.out.println("Length = "+ len);
            }
            // Store the first occurrence of the current sum
            if (!sumMap.containsKey(currentSum)) {
                sumMap.put(currentSum, i);
            }
        }
        System.out.println("Sum Map: " + sumMap);
        return len;
    }



    public static void main(String[] args) {
        SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();
        int[] nums = {1,2,1,2,1};
        int k = 3;
        int result = subArraySumEqualsK.subarraySum(nums, k);
        System.out.println("Length of longest subarray with sum " + k + ": " + result); // Output: 3
    }
}
