package Switch;

import java.util.Scanner;
// Write a program to Check whether the number is even or odd using switch statement

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number;
        number = input.nextInt();

        if (number < 0) {
            System.out.println("input grate then 0");
        } else {
            switch (number % 2) {
                case 1:
                    System.out.println("Number is even");
                    break;
                case 2:
                    System.out.println("This is odd number");
                    break;
            }
        }
    }
}
