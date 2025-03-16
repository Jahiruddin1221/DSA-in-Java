package LinkedList;
// how to find nth number from start

public class nthNodeFromEnd {

    // How to delete a Node from this method
    public static Node removeNthFromEnd(Node head, int index) {
        Node first = head;
        Node slow = head;
        for (int i = 0; i < index; i++) {
            first = first.next;
        }
        if (first == null) {
            head = head.next;
            return head;
        }
        while (first.next != null) {
            first = first.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    // how to find nth from start we need count number fot method 1
    // Finding the number of element in a Linked List
    public static Node nthNode1(Node head, int index) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        // Method 1
        int m = count - index + 1; // 100 13 4 5 12 10
        temp = head;
        for (int i = 0; i < m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Method 2  no required count number fot method 2
    public static Node nthNode2(Node head, int ind) {
        Node first = head;
        Node slow = head;
        for (int i = 0; i < ind; i++) {  // 100 13 4 5 12 10
//            if (first == null) {
//                return null;
//            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            slow = slow.next;
        }
        return slow;
    }

    public static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    // Only display Linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // 100 13 4 5 12 10

//        Node da = nthNode1(a, 5);
//        System.out.println(da.data);
//        System.out.println();
        Node da2 = nthNode2(a, 3);
        System.out.println(da2.data);

        display(a);
//        removeNthFromEnd(a, 3);
//        display(a);
        a = removeNthFromEnd(a, 6);
        display(a);


    }
}
