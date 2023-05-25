package com.company;

public class Tower_of_hanoi_rec {
    private static int count=0;
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            count++;
            return; // Base case: Only one disk to move
        }
        towerOfHanoi(n - 1, source, auxiliary, destination); // Move n-1 disks from source to auxiliary
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        count++;
        towerOfHanoi(n - 1, auxiliary, destination, source); // Move n-1 disks from auxiliary to destination
    }
    public static void counting(){
        System.out.print("Total steps: "+ count);
    }
    public static void main(String[] args) {
        int n = 3; // Number of disks
        char source = 'A'; // Source peg
        char destination = 'C'; // Destination peg
        char auxiliary = 'B'; // Auxiliary peg

        System.out.println("Tower of Hanoi steps:");
        towerOfHanoi(n, source, destination, auxiliary);
        counting();
    }
}
