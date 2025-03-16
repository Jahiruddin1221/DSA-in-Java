package Array;

public class isFoundElement2 {
    public static void main(String[] args) {
        System.out.println("Found The element present or not in the array");

        int[] array = {50, 20, 60, 85, 100, 90};
        int num = 20;

        boolean isFounf = false;
        for (int element: array) {
            if (element == num) {
                isFounf = true;
                break;
            }
        }
        if (isFounf) {
            System.out.println("The element is found in array");
        } else {
            System.out.println("Element is not found in the array");
        }
    }
}
