package PACKAGE_NAME.GFG.StackQueue;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(556);
        stack.push(8);

        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
