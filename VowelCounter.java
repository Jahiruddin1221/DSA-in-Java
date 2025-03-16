import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some text: ");

        String text = input.nextLine();
        char[] letters = text.toCharArray();

        int count = 0;
        for (char x : letters) {
            switch (x) {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    count++;
                    break;
                default:
            }
        }
        System.out.println("Number of vowel in String " + text + count);



    }
}
