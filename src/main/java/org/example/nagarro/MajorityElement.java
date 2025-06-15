package org.example.nagarro;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    /*public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }*/

    public int majority(int input1, int[] input2) {
        Map<Integer, Integer> elementCount = new HashMap<Integer, Integer>();

        for(int num : input2) {
            elementCount.put(num, elementCount.getOrDefault(num, 0)+1);
        }

        System.out.println("Element counts: " + elementCount);

        for(Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if(entry.getValue() > input1 / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = {1, 2, 1, 2, 3, 1, 2, 3, 2, 2, 2};
        int n = nums.length;
        System.out.println("Majority Element: " + majorityElement.majority(n,nums));
    }
}
