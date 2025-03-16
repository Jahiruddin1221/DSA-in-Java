package Stacks;

import java.util.Stack;

 class postToInfix {
    public static void main(String[] args) {
        String str = "953+4*6/-";   // Infix = (9-(((5+3)*4)/6))
        System.out.print(str + " = ");
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(String.valueOf(ch));
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = "(" + v1 + op + v2 + ")";
                val.push(t);  // (v1 + op + v2)

            }
        }
        System.out.println(val.peek());
    }
}
