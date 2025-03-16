package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// How to print element in order of level by (Anuj Bhaiya) YouTube

 class levelOfOrder {
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
        static void printLevel(Node root) {
            Queue<Node> q = new LinkedList<>();
            if (q.size() == 0) {
                q.add(root);
            }
            while (q.size() > 0) {
                Node current = q.poll();
                System.out.print(current.data + " ");
                if (current.left != null) {
                    q.add(current.left);
                    if (current.right != null) {
                        q.add(current.right);
                    }
                }
            }
        }
        public static void main(String[] args) {
            Node root = createTre();
            printLevel(root);

        }
    }
}
