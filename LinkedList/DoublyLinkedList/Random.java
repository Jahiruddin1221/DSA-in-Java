package LinkedList.DoublyLinkedList;

public class Random {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
        }
    }
    //Q7. How to find the give Linked list is a Palindrome or not
    public static boolean isPalindrome(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node left = head;
        Node right = temp;
        while (left != right) {
            if (left.data != right.data) return false;
            left = left.next;
            right = right.prev;
        }
        return true;

    }
    //Q4. How to insert a new Head in Doubly Linked List
    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    //Q5. How to insert a new Tail in Doubly Linked List
    public static Node insertAtTail(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
        temp = t;
        return temp;
    }
    //Q6. How to insert a new Node at any position in Doubly Linked List
    public static void insertRandom(Node head, int idx, int x) {
        Node s = head;
        for (int i = 0; i < idx-1; i++) {
            s = s.next;
        }
        // 4 10 2 56 99 13
        // 4 10 s  t  r 13
        Node r = s.next;
        Node t = new Node(x);
        // s t r
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
    }
    //Q1. Print data
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    //Q2. Print in reverse order
    public static void displatRev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    //Q3. Print from any position (a-e)
    public static void displayRandom(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(10);
        Node e = new Node(4);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        display(a);
//        displatRev(e);
//        displayRandom(b);
//
//        Node newHead = insertAtHead(a, 2);
//        display(newHead);
//
//        insertAtTail(a, 20);
//        display(a);
//
//        insertRandom(a, 3, 56);
//        display(a);


        display(a);
        if (isPalindrome(a)) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }

    }
}
