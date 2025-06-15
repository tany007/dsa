package org.example.recursion;

public class TowerOfHanoi {

    static int count = 0;

    public int solve(char source, char destination, char helper, int n) {
        if(n==1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return  1;
        }
        int move1 = solve(source, helper, destination, n - 1);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        int move2 = solve(helper, destination, source, n - 1);


        return move1 + move2 + 1;
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        int n = 3; // Number of disks
        int result = towerOfHanoi.solve('A', 'C', 'B', n);
        System.out.println("Total moves: " + result);
       // towerOfHanoi.solve('A', 'C', 'B', n); // A, B and C are names of rods
    }
}
