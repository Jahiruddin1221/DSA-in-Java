package Stacks;

import java.util.Stack;

public class RemoveElement {

    //Q4. How to remove element from any index in Stacks
    public static void removeFromIndex(Stack<Integer> st, int idx) {
        if (idx < 0 || idx >= st.size()) {
            System.out.println("Invalid index");
            return;
        }
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < idx; i++) {
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
    }
    //Q3.How to remove the bottom element from Stack
    public static void removeBottom(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > 1) {
            temp.push(st.pop());
        }
        st.pop();
        while (temp.size() > 0) {
            st.push(temp.pop());
        }
    }
    //Q2.How to reverse element of Stack
    public static void reverse(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top + " ");
        reverse(st);
        st.push(top);
    }
    //Q1.How to display element of Stack
    public static void display(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        display(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

//        removeBottom(st);
//        System.out.println(st);

        int idx = 2;
        removeFromIndex(st, idx);
        System.out.println(st);
        display(st);

//        reverse(st);
//        System.out.println();
//        display(st);

        // How to print element out of the Stack
//        Stack<Integer> temp = new Stack<>();
//        while (st.size() > 0) {
//            temp.push(st.pop());
//        }
//        while (temp.size() > 0) {
//            int x = temp.pop();
//            System.out.print(x + " ");
//            st.push(x);
//        }

    }
}
