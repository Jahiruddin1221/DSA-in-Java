package Array.TwoDarray;

public class print2Darray {
    public static void main(String[] args) {
        System.out.println("Print 2D arrays using tow nested loop\n");

        int[][] array = {{2, 3, 8}, {5, 6, 9}};
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j <= array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
}
