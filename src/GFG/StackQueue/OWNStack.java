package PACKAGE_NAME.GFG.StackQueue;
class Mystack{
    int[] arr;
    int cap;
    int top;

    Mystack(int cap){
        top = -1;
        this.cap = cap;
        arr = new int[cap];
    }

    public void push(int val){
        top++;
        arr[top] = val;
    }
    public int peek(){
        return arr[top];
    }
    public int pop(){
        int res = arr[top];
        top--;
        return res;
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return (top==-1);
    }


}
public class OWNStack {
    public static void main(String[] args) {
        Mystack s = new Mystack(10);

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
