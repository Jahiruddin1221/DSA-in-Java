package LinkedList;

public class middleElement {

    // Find middle element of the Left side (10 5 4 2 6 8 -- output = 4)
    public static Node LeftMiddle(Node head) {
        Node first = head;
        Node slow = head;
        while (first != null && first.next.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Find middle element of the write side (10 5 4 2 6 8 -- output = 2)
    public static Node WriteMiddle(Node head) {
        Node first = head;
        Node slow = head; // 10 5 4 2 6 8
                          // 10 5 4 2 6
        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(4);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 10 5 4 2 6 8
        // 10 5 4 2 6
//        Node x = middle(a);
//        display(x);
        //Node middle = LeftMiddle(a);
        Node middle = WriteMiddle(a);
        if (middle != null) {
            System.out.println("The middle node is: " + middle.data);
        } else {
            System.out.println("The list is empty.");
            System.out.println(WriteMiddle(a));
        }
    }
    }
