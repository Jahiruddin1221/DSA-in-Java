package Stacks;
// How to do array implementation of stack

public class arrayImplementation {
    public static class Stack{
        private int[] arr = new int[5];

        // How to push element in a Stack
        int idx = 0;
        void push(int x) {
            if (idx == arr.length) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        // How to peek element from a Stack
        int peek() {
            if (idx == 0) {
                System.out.println("Stack is empty");
                return 0;
            }
            return arr[idx - 1];
        }
        // How to pop element from a Stack
        int pop() {
            if (idx == 0 ){
                System.out.println("Stack is empty");
                return 0;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }
        // How to print element of a Stack
        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        // How to find size of element
        void size() {
            System.out.println("Size of element is " + idx);
        }
        void capacity() {
            System.out.println("Total capacity of Stack " + arr.length);
        }
        boolean isEmpty() {
            if (idx == 0) return true;
            else return false;
        }
        boolean isFull() {
            if (idx == arr.length) return true;
            else return false;
        }


    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.display();
        st.push(6);
        st.display();
        st.push(9);
        st.display();
        st.push(9);
        st.display();
//        st.size();
//        st.capacity();
}
}
