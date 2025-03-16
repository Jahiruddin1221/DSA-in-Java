package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// How to print of right element of a Tree by (Anuj Bhaiya) YouTube

 class rightView {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        // Method to create the tree
        public static Node createTree() {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num == 0) return null;

            Node root = new Node(num);
            System.out.println("Enter your left child of " + num);
            root.left = createTree();
            System.out.println("Enter your right child of " + num);
            root.right = createTree();
            return root;
        }
    }

    // Method to print the right view of the tree
    public static void printRightView(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        if (q.size() == 0) {
            q.add(root);
        }

        while (q.size() != 0) {
            int n = q.size();
            // Traverse nodes at the current level
            for (int i = 1; i <= n; i++) {
                Node temp = q.poll();
                if (i == n) {
                    System.out.print(temp.data + " ");
                }

                // Add children to the queue
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Node root = Node.createTree();

        System.out.println("Right View of the Tree:");
        printRightView(root);
    }
}
