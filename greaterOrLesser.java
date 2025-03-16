import java.util.Scanner;

public class greaterOrLesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inter first number: ");
        int num1 = input.nextInt();
        System.out.print("Inter second number: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("Number is equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " number is greater then " + num2);
        } else {
            System.out.println(num2 + " number is greater then " + num1);
        }
    }
}
