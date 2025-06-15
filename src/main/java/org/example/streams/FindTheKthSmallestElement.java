package org.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTheKthSmallestElement {

    public static void main(String [] args) {
       // int[] arr = {7, 10, 4 , 3, 20, 15};
        List<Integer> list = Arrays.asList(7, 10, 4, 3, 20, 15);
        int k = 3; // Find the 3rd smallest element
      //  int kthSmallest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(k-1).findFirst().orElse(-1);
        int kthSmallest = list.stream().sorted(/*Comparator.reverseOrder()*/).skip(k-1).findFirst().orElse(-1);

        System.out.println(kthSmallest);
    }

    public static void main(String[] args, int k) {
        List<Integer> list = Arrays.asList(7, 10, 4, 3, 20, 15);
        int kthSmallest = list.stream().sorted().skip(k - 1).findFirst().orElse(-1);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
