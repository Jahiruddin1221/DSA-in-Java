package Array;

public class riverseArray1 {
    // Input a array number and print reverse this array

    public static void main(String[] args) {

        int[] array = {5, 3, 9, 8, 6};
        System.out.println("Reverse array is");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
