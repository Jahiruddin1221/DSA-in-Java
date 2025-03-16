package Trees;

import java.util.Scanner;
// How to find the maximum element of the tree using recursion by (Anuj Bhaiya) YouTube

 class maxMinOfTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }

        public static Node createTre() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = input.nextInt();
            //Node root = null;
            if (num == 0) return null;

            Node root = new Node(num);
            System.out.println("Enter the left child of " + num);
            root.left = createTre();
            System.out.println("Enter the right child of " + num);
            root.right = createTre();

            return root;
        }

        static int maxVal(Node root) {
            if (root == null) return Integer.MIN_VALUE;
            int leftMax = maxVal(root.left);
            int rightMax = maxVal(root.right);
            // Return the largest value among the root, left subtree, and right subtree
            return Math.max(root.data, Math.max(leftMax, rightMax));

        }
        static int minVal(Node root) {
            if (root == null) return Integer.MAX_VALUE;
            int leftMin = minVal(root.left);
            int rightMin = minVal(root.right);

            return Math.min(root.data, Math.min(leftMin, rightMin));
        }

        public static void main(String[] args) {
            Node root = createTre();
            System.out.print("The maximum element of the tree is " + maxVal(root));
            System.out.println();
            System.out.print("The minimum element of the tree is " + minVal(root));


        }
    }
}
