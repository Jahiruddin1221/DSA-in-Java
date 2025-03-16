package Stacks;

import java.util.Stack;

 class postToPre {
    public static void main(String[] args) {
        String str = "953+4*6/-";  // "-9/*+5346"
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ch+"");  //  val.push(String.valueOf(ch));
            } else {
                String v1 = val.pop();
                String v2 = val.pop();
                char op = ch;
                val.push(op + v1 + v2);
            }
        }
        System.out.println(val.peek());
    }
}
