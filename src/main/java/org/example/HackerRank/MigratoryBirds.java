package org.example.HackerRank;

import java.util.*;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int max=0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<arr.size();i++){
            m.put(arr.get(i), m.getOrDefault(arr.get(i), 0)+1);
        }

        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()>max){
                max = e.getKey();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 4, 5);
        int result = migratoryBirds(arr);
        System.out.println("Most common bird type: " + result);
    }
}
