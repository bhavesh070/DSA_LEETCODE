package PACKAGE_NAME.GFG.StackQueue;
class ListNode{
    int val;
    ListNode next;

    ListNode(){
    }
    ListNode(int val){
        this.val = val;
    }
    ListNode (int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
class MYStack{
    ListNode top;
    int size;
    public void push(int val){
        ListNode ns = new ListNode(val);
        ns.next = top;
        top = ns;
        size++;
    }
    public int peek(){
        return top.val;
    }
    public int pop(){
        int res = top.val;
        top=top.next;
        size--;
        return res;
    }
    public boolean isEmpty(){
        return (top==null);
    }
    public int size(){
        return size;
    }
}
public class STACK_LinkedList {
    public static void main(String[] args) {
        MYStack s = new MYStack();
        s.push(10);
        s.push( 20);
        s.push(30);

        System.out.println(s.peek());
        System.out.println(s.pop());

        s.push(40);

        System.out.println(s.size());
        System.out.println(s.isEmpty());

    }
}
