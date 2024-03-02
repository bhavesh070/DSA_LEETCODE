package PACKAGE_NAME.GFG.LinkedList;
import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    Node head;
    Node current;
    public void push(int data){
        Node newnode = new Node(data);
        if (head==null){
            head = newnode;
            return;
        }
        current = head;
        while (current.next!=null){
            current = current.next;
        }
        current.next = newnode;
    }
    public boolean detectLoop(){
        Node fast = head;
        Node slow = head;
        while (fast!=null&& fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number of elemnet");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int data = sc.nextInt();
            list.push(data);
        }
        System.out.println("enter the last index for loop");
        int s = sc.nextInt();
        Node current = list.head;
        for (int i=0;i<s && current!=null;i++){
            current = current.next;
        }
        if (current!=null){
            list.current.next = current;
        }
        boolean hasloop = list.detectLoop();
        if (hasloop){
            System.out.println("Lopo detected");
        }else {
            System.out.println("Not deteceted");
        }
    }
}