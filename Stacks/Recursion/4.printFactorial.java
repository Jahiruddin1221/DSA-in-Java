package Stacks.Recursion;

import java.util.Scanner;
// Find factorial of the number  (1*1=1, 1*2=2, 1*2*3=6, 1*2*3*4=24)

 class printFactorial {
    public static int calculateFact(int n) {
        if (n == 1 || n == 0) return 1;
        int idx = calculateFact(n-1);
        int result = n * idx;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        int ans = calculateFact(n);
        System.out.println("Your total factorial is " + ans);
    }
}
