package Stacks.Recursion;

import java.util.Scanner;

 class printNaturalNumber {
    public static void printNumber(int n) {
        if (n == 10) return;
        System.out.println(n);
        printNumber(n+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int n = input.nextInt();
        printNumber(n);

    }
}
