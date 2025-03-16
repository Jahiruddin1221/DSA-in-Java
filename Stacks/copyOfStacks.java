package Stacks;

import java.util.Stack;

public class copyOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> newSt = new Stack<>();
        while (st.size() > 0) {
            newSt.push(st.pop());
        }

        Stack<Integer> updateSt = new Stack<>();
        while (newSt.size() > 0) {
            updateSt.push(newSt.pop());
        }
        System.out.println(updateSt);
    }
}
