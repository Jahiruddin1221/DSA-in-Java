package Array;

import java.util.Scanner;

public class printGreatestElement {
    // Take a input from array and print the greatest element

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int size = input.nextInt();

        int[] element = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < element.length; i++) {
            element[i] = input.nextInt();
        }
        System.out.println("Original elements is");
        for (int i = 0; i < element.length; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println("\nGreatest element is");
        int greatest = element[0];
        for (int i = 1; i < element.length; i++) {
            if (element[i] > greatest) {
                greatest = element[i];
            }
        }
        System.out.println(greatest);
    }
}
