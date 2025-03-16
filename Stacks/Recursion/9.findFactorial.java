package Stacks.Recursion;

import java.util.Scanner;
// Example 5 = 5*4*2*1 = 120

 class findFactorial {
    public static int FactorialOfNumber(int n) {
        if (n == 0 || n < 0) {
            return 1;
        } else {
            return FactorialOfNumber(n - 1) * n;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.println(FactorialOfNumber(num));
    }
}
