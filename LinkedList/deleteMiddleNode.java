package LinkedList;
// How delete a Node of a right side / middle from a linked list

public class deleteMiddleNode {
    public static Node delete(Node head) {
        Node first = head;
        Node slow = head;
        // 1 2 3 4 5 6 (Output = 4) &&  1 2 3 9 5 6 7 (Output = 9)
        while (first.next.next != null && first.next.next.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(9);
        Node c = new Node(7);
        Node d = new Node(12);
        Node e = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        Node x = delete(a);
        display(x);

        }
}
