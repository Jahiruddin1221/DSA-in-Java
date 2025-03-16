package Stacks.Recursion;

import java.util.Scanner;
// Find the power of given number (2*2*2==8) Learning by Gyanipandit Geeky-Hindi (YouTube)

 class powerCalculation {
    public static int Power(int n, int p) {
        if (p == 0) return 1;
            else {
                return n * Power(n, p-1); // Function called repeatedly by getting power {n * n^p-1}
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power: ");
        int pow = input.nextInt();

        int ans = Power(num, pow);
        System.out.println("Ans is " + ans);
    }

}
