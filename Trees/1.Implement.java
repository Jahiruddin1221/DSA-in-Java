package Trees;

import java.util.Scanner;

 class Implement {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
        //Q.1 How to link of element in a tree by (Anuj Bhaiya) YouTube
        static Node createTree() {
            Scanner input = new Scanner(System.in);
            //Node root = null;
            System.out.print("Enter data: ");
            int data = input.nextInt();
            if (data == 0) return null;

            Node root = new Node(data);
            System.out.println("Enter left child of " + data);
            root.left = createTree();
            System.out.println("Enter right child of " + data);
            root.right = createTree();
            return root;
        }
        //Q.2 Binary tree traversal Inorder using recursion
        public static void inOrder(Node root) {
            if (root == null) return;
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
        //Q.2 Binary tree traversal PreOder using recursion
        static void preOrder (Node root) {
            if (root == null) return;
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        //Q.2 Binary tree traversal postOrder using recursion
        static void postOrder(Node root) {
            if (root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
        //Q.3 How to find total height of the tree using recursion
        public static int height(Node root) {
            if (root == null) return 0;
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight,rightHeight) + 1;

        }
        //Q.4 How to find total size of the tree using recursion
        public static int sizeOfTree(Node root) {
            if (root == null) return 0;
            int lefSize = sizeOfTree(root.left);
            int rightSize = sizeOfTree(root.right);
            return (lefSize + rightSize) + 1;
        }


        public static void main(String[] args) {
            Node root = createTree();

            inOrder(root);
            System.out.println();

            preOrder(root);
            System.out.println();

            postOrder(root);
            System.out.println();

            System.out.println("Total height of the tree is " + height(root));

            System.out.println("Total size of the tree is " + sizeOfTree(root));


        }

    }
}
