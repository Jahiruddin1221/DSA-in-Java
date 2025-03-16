import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Invalid number please enter grater than 0");
        } else if (num % 2 ==0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
