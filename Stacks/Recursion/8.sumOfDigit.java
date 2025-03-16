package Stacks.Recursion;

import java.util.Scanner;

 class sumOfDigit {
    public static int sumDigit(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10 + sumDigit(n / 10));
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        int ans = sumDigit(num);
        System.out.print("Total sum of number is " + ans);
    }
}
