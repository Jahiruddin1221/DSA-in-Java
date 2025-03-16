package Stacks;

import java.util.Stack;

public class insertNewElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> tempSt = new Stack<>();
        int idx = 2;
        int x = 7;
        while (st.size() > idx) {
            tempSt.push(st.pop());
        }
        st.push(x);
        while (tempSt.size() > 0) {
            st.push(tempSt.pop());
        }
        System.out.println(st);
    }
}
