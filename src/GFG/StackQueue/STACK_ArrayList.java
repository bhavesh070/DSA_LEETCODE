package PACKAGE_NAME.GFG.StackQueue;

import java.util.ArrayList;

import java.util.ArrayList;

class mystack {
    ArrayList<Integer> el = new ArrayList<>();

    public void push(int val) {
        el.add(val);
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return el.get(el.size() - 1);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int res = el.get(el.size() - 1);
        el.remove(el.size() - 1);
        return res;
    }

    public int size() {
        return el.size();
    }

    public boolean isEmpty() {
        return el.isEmpty();
    }
}

public class STACK_ArrayList {
    public static void main(String[] args) {
        mystack s = new mystack();
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());

        s.push(35);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
