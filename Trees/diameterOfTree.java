package Trees;

import java.util.Scanner;
// How to print diameter of a tree by (Anuj Bhaiya) YouTube

public class diameterOfTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
        public static Node create () {
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
    }
    public static int diameter(Node root) {
        int ans = 0;
        if (root == null) return 0;
        int leftDia = diameter(root.left);
        int rightDia = diameter(root.right);
        ans = Math.max(ans, 1 + leftDia + rightDia);
        return Math.max(leftDia, rightDia) + 1;
    }
    public static void main(String[] args) {
        Node root = Node.create();
        System.out.println(diameter(root));

    }
}
