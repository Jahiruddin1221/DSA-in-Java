package LinkedList;

public class nodeOfCycle {
    public static Node IsCycle(Node head) {
        Node first = head;
        Node slow = head;
        while (first != null || first.next != null) {
            slow = slow.next;
            first = first.next.next;
            if (first == slow) {
                Node temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                    if (slow == temp) {

                    }
                    return temp;
                }
            }

        }
        return null;
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

        public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(8);
            Node d = new Node(10);
            a.next = b;
            b.next = c;
            c.next = d;

            display(a);
            nodeOfCycle cycle = new nodeOfCycle();
            Node s = cycle.IsCycle(a);
            if (s != null) {
                System.out.println(s.data);
            } else {
                System.out.println();
            }

        }
    }
}
