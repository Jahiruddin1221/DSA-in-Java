package LinkedList;
// How to find out marge element from two Mode

public class intersectionLinkedList {
    public static Node margeLinkedList(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        int length1 = 0;
        while (temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        int length2 = 0;
        while (temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if (length1 > length2) {
            int steps = length1 - length2;
            for (int i = 0; i < steps; i++) {
                temp1 = temp1.next;
            }
        } else {
            int steps = length2 - length1;
            for (int i = 0; i < steps; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
//    public static void display(Node head1, Node head2) {
//        Node temp1 = head1;
//        Node temp2 = head2;
//        while (temp1 != temp2) {
//            System.out.println(temp1.data + " ");
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//
//        }
//    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(7);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 100 13 4 5 10

        Node x = new Node(100);
        Node y = new Node(13);
        Node z = new Node(4);
        Node p = new Node(10);
        x.next = y;
        y.next = z;
        z.next = p;

        Node k = margeLinkedList(a, x);
       // display(a,x);
        System.out.println(k);

    }
}
