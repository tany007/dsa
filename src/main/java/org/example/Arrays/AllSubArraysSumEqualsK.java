package org.example.Arrays;

public class AllSubArraysSumEqualsK {

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        AllSubArraysSumEqualsK solution = new AllSubArraysSumEqualsK();
        int[] nums = {1,2,1,2,1};
        int k = 3;
        System.out.println("Number of subarrays with sum " + k + ": " + solution.subarraySum(nums, k));
    }
}
