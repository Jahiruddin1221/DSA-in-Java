package Array;

import java.util.Scanner;

public class isFoundElement1 {
    // input some number and find a number the number is present or not.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find the element present or not in arrays");

        System.out.print("Enter size of element: ");
        int num = input.nextInt();
        int[] number = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the number: ");
            number[i] = input.nextInt();
        }

        System.out.print("Enter number that you want to search: ");
        int x = input.nextInt();

        for (int i = 0; i < num; i++) {
            if (number[i] == x) {
                System.out.println("Element is found");
            } else {
                System.out.println("Element is not found");
                break;
            }
        }
    }
}
