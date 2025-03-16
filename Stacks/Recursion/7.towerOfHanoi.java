package Stacks.Recursion;

import java.util.Scanner;
// Game for Tower of Hanoi

 class towerOfHanoi {
    public static void Tower(int n, String S, String H, String D) {
        if (n == 1) {
            System.out.println("Transfer disk no " + n + " from " + S + " to " + D);
            return;
        }
        Tower(n-1, S, D, H); // To move n-1 disks from S to D using H
        System.out.println("Transfer disk no " + n + " from " + S + " to " + D);
        Tower(n-1, H, S, D);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of disk for you want to play: ");
        int n = input.nextInt();

        Tower(n,"source", "help", "destination");
    }
}
