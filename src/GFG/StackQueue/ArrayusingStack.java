package PACKAGE_NAME.GFG.StackQueue;
public class ArrayusingStack {
    public static final int Max_size = 100;
    public int[] stackArray;
    int top;
    public ArrayusingStack() {
        stackArray = new int[Max_size];
        top = -1;
    }
    // Push operation to add an element to the stack
    public void push(int value) {
        if (top == Max_size - 1) {
            System.out.println("Stack overflow! Cannot push element " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }
    // Pop operation to remove and return the top element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow! Cannot pop element");
            return -1; // Return a sentinel value indicating underflow
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }
    public static void main(String[] args) {
        ArrayusingStack stack = new ArrayusingStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Top element: " + stack.isEmpty()); // Output: Top element: 30
        stack.pop();
        stack.display();
        System.out.println("Is the stack empty? " + stack.isEmpty()); // Output: Is the stack empty? false
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}