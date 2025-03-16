package Loop;

import java.util.Scanner;

public class PrintNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 0; i <=num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
