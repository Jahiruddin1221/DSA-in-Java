package LinkedList;

public class Random {
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
        }else {
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
    public static Node delete(Node head, int n) {
        // 9 12 10 5 2
        Node first = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
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
        return slow;
    }
    // Method 2
    public static Node nthNode2(Node head, int ind) {
        Node first = head;
        Node slow =head;

        for (int i = 0; i < ind; i++) {
            if (first == null) {
                return null;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            slow = slow.next;
        }
        return slow;
    }
    // Method 1
    public static Node nthNode(Node head, int index) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        // formula
        int m = count - index;
        temp = head;
        for (int i = 0; i < m; i++) {
            temp = temp.next;
        }
        return temp;
    }
   public static class Node{
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
        Node a = new Node(9);
        Node b = new Node(12);
        Node c = new Node(10);
        Node d = new Node(5);
        Node e = new Node(2);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        // 9 12 10 5 2

        Node x = new Node(100);
        Node y = new Node(13);
        Node z = new Node(4);
        Node p = new Node(10);
        x.next = y;
        y.next = z;
        z.next = p;

//        Node x = nthNode(a, 5);
//        System.out.println(x.data);
//        System.out.println();
//        Node y = nthNode2(a, 3);
//        System.out.println(y.data);
//        display(a);
//       a = delete(a, 2);
//        delete(a, 4);
        display(a);
        Node intersection = margeLinkedList(a, x);

        // Print result
        while (intersection != null) {
            System.out.println("Your data is " + intersection.data);
            intersection = intersection.next;
        }
    }
}