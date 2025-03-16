package Array;

public class sumOfArray2 {
    public static void main(String[] args) {
        System.out.println("Sum of arrays using for-each loop");

        int[] array = {50, 20, 90, 56, 48};
        int sum = 0;
        for (int elements: array) {
            sum += elements;
        }
        System.out.println("Sum of arrays is "+ sum);
    }
}
