package Stacks;

import java.util.Stack;
// In case of preFix always loop will be run tail to head

 class preToInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";     // InFix (9-(((5+3)*4)/6))
        System.out.print(str + " = ");
        Stack<String> val = new Stack<>();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(String.valueOf(ch)); 
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);
            }
        }
        System.out.println(val.pop());

    }
}
