package org.example.recursion;

public class KthSymbolInGrammar {

    public int solve(int n, int k) {
        if(n==1 && k==1) {
            return 0;
        }

        int mid = (int) Math.pow(2, n - 1) / 2;

        if(k<=mid){
            return solve(n - 1, k);
        }
        else {
            return 1- solve(n - 1, k - mid);
        }
    }

    public static void main(String[] args) {
        KthSymbolInGrammar kthSymbolInGrammar = new KthSymbolInGrammar();
        int n = 40;
        int k = 50;
        int result = kthSymbolInGrammar.solve(n, k);
        System.out.println("The " + k + "th symbol in the " + n + "th row of the grammar is: " + result);
    }
}
