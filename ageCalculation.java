import java.util.Scanner;

public class ageCalculation {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age <= 0) {
            System.out.println("You are a invalade age please enter grater than 0");
        } else if (age >= 18 && age < 30) {
            System.out.println("Your are a adult");
        } else if (age < 18) {
            System.out.println("Your a child");

        } else {
            System.out.println("You are very oldest mane");
        }

    }
}
