package Trees;

import java.util.Scanner;
// How to find sum of all element in Tree

 class sumOfElement {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
        public static Node create() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num == 0) return null;

            Node root = new Node(num);
            System.out.println("Enter the left child of " + num);
            root.left = create();
            System.out.println("Enter the right child of " + num);
            root.right = create();
            return root;
        }
        public static int totalSum(Node root) {
            if (root == null) return 0;
            int leftSum = totalSum(root.left);
            int rightSum = totalSum(root.right);

            return leftSum + rightSum + root.data;
        }
        public static void main(String[] args) {
            Node root = Node.create();
            System.out.println("Total sum of element is " + totalSum(root));

        }
    }

}
