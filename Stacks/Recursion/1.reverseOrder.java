package Stacks.Recursion;

import java.util.Scanner;

class reverseOrder {
    public static void printNumber(int n) {
        if (n == 0) return;
        System.out.println(n);
        printNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int n = input.nextInt();
       // int n = 5;
        printNumber(n);
    }
}
