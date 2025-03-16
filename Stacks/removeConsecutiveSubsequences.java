package Stacks;

import java.util.Stack;

public class removeConsecutiveSubsequences {
        public static int[] remove(int[] arr) {
            Stack<Integer> st = new Stack<>();

            // Traverse through the array
            for (int i = 0; i < arr.length; i++) {
                // If the stack is empty or current element is not equal to the top element of stack
                if (st.isEmpty() || st.peek() != arr[i]) {
                    st.push(arr[i]);
                } else if (arr[i] == st.peek()) {
                    // If it's the same as the top, then pop from the stack
                    st.pop();
                }
            }

            // Converting the stack to an array
            int[] result = new int[st.size()];
            int idx = result.length - 1;
            for (int i = idx; i >=0; i--) {
                result[i] = st.pop();
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
            int[] res = remove(arr); // Fixed variable type to int[]

            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }