package Array;

import java.util.Scanner;

public class printLowestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        int size = input.nextInt();

        int[] array = new int[size];
        System.out.print("Enter elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        System.out.println("Original element is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nLowest element is");
        int lowest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (lowest > array[i]) {
                lowest = array[i];
            }
        }
        System.out.print(lowest);
    }
}
