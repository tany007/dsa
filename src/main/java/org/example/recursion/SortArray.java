package org.example.recursion;

import java.util.ArrayList;

public class SortArray {

    public void sortArray(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        if(nums.size() == 1) {
            return;
        }

        int temp = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);

        // Recursively sort the remaining array
        sortArray(nums);

        // Insert the removed element back into the sorted array
        insert(nums, temp);


    }

    private void insert(ArrayList<Integer> nums, int temp) {

        if(nums.size() == 0 || nums.get(nums.size() - 1) <= temp) {
            nums.add(temp);
            return;
        }
        int val = nums.get(nums.size() - 1);
        nums.remove(nums.size() - 1);
        insert(nums, temp);
        nums.add(val);
        return;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(1);
        nums.add(4);
        nums.add(2);
        nums.add(8);

        SortArray sortArray = new SortArray();
        sortArray.sortArray(nums);

        System.out.println("Sorted array: " + nums);
    }
}
