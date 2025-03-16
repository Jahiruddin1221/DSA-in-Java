package Array.TwoDarray;

import java.util.Scanner;

public class sumOfDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = input.nextInt();

        int[][] array = new int[size][size];
        System.out.print("Enter element: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        // print
        System.out.println("Original elements");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        // Sum
        System.out.println("Sum of diagonal");
        int sumL = 0, sumR = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    sumL += array[i][j];
                    if (i + j == array.length-1) {
                        sumR += array[i][j];
                    }
                }
             }
        }
        System.out.println(sumL);
        System.out.println(sumR);
    }
}

