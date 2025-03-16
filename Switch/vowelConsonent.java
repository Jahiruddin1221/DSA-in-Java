package Switch;

import java.util.Scanner;
// Write a program to Check whether a character is a vowel or consonant using switch statement
public class vowelConsonent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a alphabet: ");
        char cha = input.next().charAt(0);

        switch (cha) {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :

            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :

                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("This is consonant");
        }
    }
}
