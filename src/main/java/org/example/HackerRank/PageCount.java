package org.example.HackerRank;

public class PageCount {

    public static int pageCount(int n, int p) {
       /* // Write your code here
        int turnForward =0, turnBackward=0;
        if(n==p)
            return 0;

        for(int i=1;i<n;i=i+2){
            if(p!=i || p!=i-1){
                turnForward++;
            } else {
                break; // If we reach the page we want, we can stop counting
            }
        }

        for(int j=n;j>=1;j=j-2){
            if(p!=j || p!=j-1){
                turnBackward++;
            } else {
                break; // If we reach the page we want, we can stop counting
            }
        }
        System.out.println("Turn Forward: " + turnForward + ", Turn Backward: " + turnBackward);*/
        // Calculate forward page turns
        int turnForward = p / 2;

        // Calculate backward page turns
        int turnBackward = (n / 2) - (p / 2);

        return Math.min(turnForward, turnBackward);

    }

    public static void main(String[] args) {
        int n = 18183; // Total number of pages
        int p = 18042; // Page to turn to
        int result = pageCount(n, p);
        System.out.println("Minimum number of page turns: " + result); // Output: 1
    }


}

