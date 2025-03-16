package Stacks.Recursion;

import java.util.Scanner;
// Print the all fibonacci of given number (0, 1, 1, 2, 3, 5, 8, 13)

 class Fibonacci {
    public static int printFib(int n) {
        if (n == 0 || n == 1) return n;  // Base case: return n if 0 or 1
        int a = printFib(n-1);   // Previous fast  Fibonacci number
        int b = printFib(n-2);   // Previous second  Fibonacci number
        int result = a+b;       // Sum of the previous two Fibonacci numbers
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int ans = printFib(i);
            System.out.print(ans + " ");
        }

    }
}
