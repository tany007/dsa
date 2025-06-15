package org.example.String;

public class NextGreaterElement2 {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = -1; // Initialize all elements to -1
            for(int j=1;j<n;j++){
                int nextIndex = (i+j) % n; // Circular array logic
                if(nums[nextIndex] > nums[i]){
                    result[i] = nums[nextIndex];
                    break; // Found the next greater element, break the inner loop
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        NextGreaterElement2 nextGreaterElement2 = new NextGreaterElement2();
        int[] nums = {1, 2, 1};
        int[] result = nextGreaterElement2.nextGreaterElements(nums);
        System.out.print("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
