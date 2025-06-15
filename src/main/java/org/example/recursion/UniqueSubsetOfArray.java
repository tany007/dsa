package org.example.recursion;

import java.util.ArrayList;

public class UniqueSubsetOfArray {

    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        solve(arr, n, 0, inner, outer);
        return outer;
    }

    private static void solve(int[] arr, int n, int i, ArrayList<Integer> inner, ArrayList<ArrayList<Integer>> outer) {
        if (i == n) {
            outer.add(new ArrayList<>(inner));
            return;
        }

        // Exclude the current element
        solve(arr, n, i + 1, inner, outer);

        // Include the current element
        inner.add(arr[i]);
        solve(arr, n, i + 1, inner, outer);
        inner.remove(inner.size() - 1); // Backtrack
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 2};
        int n = arr.length;
        ArrayList<ArrayList<Integer>> result = AllSubsets(arr, n);
        System.out.println("Unique subsets of the array: " + result);
    }
}


