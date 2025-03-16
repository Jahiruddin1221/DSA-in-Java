package Stacks.Recursion;

import java.util.Scanner;
// Print the sum of all natural number i==1+2+3+4+5==15; (sum==0, 1, 3, 6, 10, 15)

 class somOfNumber {
     public static int sumNatural(int n) {
         if (n == 0 || n == 1) return 1;
         int idx = sumNatural(n-1);
         int result = n + idx;
         return result;
     }
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter any number: ");
         int n = input.nextInt();
         int ans = sumNatural(n);
         System.out.print("Total sum of the natural number is " + ans);

     }
}
