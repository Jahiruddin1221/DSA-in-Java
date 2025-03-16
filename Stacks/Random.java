package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Random {
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                st.pop();

            }
        }
        int[] res = new int[st.size()];
        for (int i = res.length-1; i >=0; i--) {
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,2,5,1,4,4,4,8,8,3};
        int[] x = remove(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
