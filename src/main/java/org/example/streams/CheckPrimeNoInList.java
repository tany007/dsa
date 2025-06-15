package org.example.streams;

import java.util.Arrays;
import java.util.List;

public class CheckPrimeNoInList {

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false; // n is divisible by i, hence not prime
            }
        }
        return true; // n is prime
    }

    public boolean getPrime(int array[]) {
        if (array == null || array.length == 0) {
            return false; // Handle empty or null list
        }
        return Arrays.stream(array).anyMatch(this::isPrime);
    }

    public static void main(String[] args) {
        int array[] = {22, 32, 52, 27, 121};
        CheckPrimeNoInList checkPrimeNoInList = new CheckPrimeNoInList();
        boolean allPrime = checkPrimeNoInList.getPrime(array);
        System.out.println("Numbers in the list contains Prime? " + allPrime);
    }


}
