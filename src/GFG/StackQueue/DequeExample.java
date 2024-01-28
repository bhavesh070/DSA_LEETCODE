package PACKAGE_NAME.GFG.StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(66);
        deque.addFirst(44);
        deque.addLast(33);
        System.out.println(deque.removeLastOccurrence(33));
        System.out.println(deque.peek());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());


    }
}
