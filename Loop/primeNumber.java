package Loop;

import java.util.Scanner;

public class primeNumber {
    // Input a number a found this number is prime or not

    public static void main(String[] args) {
        System.out.println("Number is prime or not\n");
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("Your number is prime number");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
