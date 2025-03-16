package Stacks.Queue;

import java.util.LinkedList;
import java.util.Queue;

 class Bssic {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);  // How to add element   (push, pop, peek == add, remove/poll, peek/element)
        qu.add(2);
        qu.add(3);
        qu.add(4);
        qu.add(5);
        System.out.println(qu);
        qu.remove();      // How to remove element
        System.out.println(qu);
        System.out.println(qu.size());
        qu.add(9);
        System.out.println(qu);
    }
}
