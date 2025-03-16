package Array;

import java.util.Scanner;

public class PrintEvenNumber {
    // Print the even or odd value in arrays.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of element: ");
        int num = input.nextInt();
        int[] number = new int[num];

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("Even number is: ");
                System.out.println(i);
            }
        }
    }
}
