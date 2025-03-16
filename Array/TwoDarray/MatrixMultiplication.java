package Array.TwoDarray;

import java.util.Scanner;

public class MatrixMultiplication {
    // Print multiplication in 2D array using for loop

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, k;
        int aRows, aColumns, bRows, bColumns;

        // input matrix A
        System.out.println("Enter rows and columns of matrix A: ");
        aRows = input.nextInt();
        aColumns = input.nextInt();

        int[][] a = new int[aRows][aColumns];
        System.out.println("Enter rows: ");
        for (i = 0; i < aRows; i++) {
            for (j = 0; j < aColumns; j++) {
                a[i][j] = input.nextInt();
            }
        }
        // input matrix B
        System.out.println("Enter rows and columns of matrix B");
        bRows = input.nextInt();
        bColumns = input.nextInt();

        if (aRows != bColumns) {
            System.out.println("Sorry! We can not multiply your matrix A and B");
            System.out.println("Please enter same rows and column for matrix");
            return;
        }

        int[][] b = new int[bRows][bColumns];
        System.out.println("Enter columns: ");
        for (i = 0; i < bRows; i++) {
            for (j = 0; j < bColumns; j++) {
                b[i][j] = input.nextInt();
            }
        }
        // multiply
        int[][] product = new int[aRows][bColumns];
        for (i = 0; i < aRows; i++) {
            for (j = 0; j < bColumns; j++) {
                int sum = 0;
                for (k = 0; k < bRows; k++) {
                    sum += a[i][k] * b[j][k];
                    product[i][j] = sum;
                }
            }
        }
        // result
        System.out.println("Your result: ");
        for (i = 0; i < aRows; i++) {
            for (j = 0; j < bColumns; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

    }
}

