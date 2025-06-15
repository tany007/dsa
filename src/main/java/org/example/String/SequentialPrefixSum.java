package org.example.String;

/*
url: https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/description/
 */

import java.util.Set;

public class SequentialPrefixSum {

    int sequentialPrefixSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        Set<Integer> set = new java.util.HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i=1;i<n;i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }

    public static void main(String[] args) {
        SequentialPrefixSum sequentialPrefixSum = new SequentialPrefixSum();
        int[] nums = {3,4,5,1,12,14,13};
        int result = sequentialPrefixSum.sequentialPrefixSum(nums);
        System.out.println("Smallest Missing Integer Greater Than Sequential Prefix Sum: " + result); // Output: 6
    }




}


