package Array;

public class sumOfArray1 {
    public static void main(String[] args) {
        System.out.println("Sum of arrays using for loop");

        int[] array = {50, 20, 45, 100, 82};
        // using for loop
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of arrays is "+ sum);
    }
}
