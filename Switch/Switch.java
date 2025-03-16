package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int button = input.nextInt();

        switch (button) {
            case 1 :
                System.out.println("Jhair");
                break;
            case 2 :
                System.out.println("Samaun");
                break;
            case 3 :
                System.out.println("Sabirul");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
