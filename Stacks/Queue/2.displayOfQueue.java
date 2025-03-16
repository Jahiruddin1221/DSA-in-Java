package Stacks.Queue;

import java.util.LinkedList;
import java.util.Queue;
// Normally display a element using extra Queue

 class displayOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        Queue<Integer> newQ = new LinkedList<>();
        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            newQ.add(q.poll());
        }
        while (newQ.size() > 0) {
            q.add(newQ.poll());
        }

    }
}
