package Array;

public class MaxMinValue {
    // Find the maximum value and minimum value

    public static void main(String[] args) {

        int[] a = {8, 6, 5, 5, 4, 2};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];

            }
        }
        System.out.println("Minimum value is " + min);
    int[] b = {65,85,83,54,35,};
    int max = b[0];
    for (int i = 1; i < b.length; i++) {
        if (b[i] > max);
        max = b[i];

    }
        System.out.println("Maximum value is " + max);
}
}
