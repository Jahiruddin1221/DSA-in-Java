package Stacks;

import java.util.Stack;

public class basicOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(3);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(23);
        // peek
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("Size is " + st.size());

        while (st.size() > 1) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        st.push(9);
        System.out.println(st);
        System.out.println(st.isEmpty());
    }
}
