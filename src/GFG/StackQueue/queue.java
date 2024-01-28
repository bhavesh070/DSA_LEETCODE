package PACKAGE_NAME.GFG.StackQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(88);
        queue.add(33);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
}
