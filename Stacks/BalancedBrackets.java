package Stacks;

import java.util.Scanner;
import java.util.Stack;

public interface BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cr = str.charAt(i);   // Character
            if (cr == '(') {
                st.push(cr);
            } else {
                if (st.size() == 0) return false;
                if (st.peek() == '(') st.pop();
            }
        }
        if (st.size() > 0) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter bracket: ");
        String str = input.nextLine();
        if (isBalanced(str)) {
            System.out.println("It is a balanced bracket");
        } else {
            System.out.println("It is not a balanced bracket");
        }
    }
}
