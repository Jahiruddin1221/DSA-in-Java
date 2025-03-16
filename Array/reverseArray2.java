package Array;

import java.util.Scanner;

public class reverseArray2 {
    // Input array element and print reverse order

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("No of element: ");
        int num = input.nextInt();

        int[] array = new int[num];
        System.out.print("Enter array element: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Your original value is");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Reverse value is");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
