package PACKAGE_NAME.GFG.LinkedList;


import java.util.Scanner;
class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class OddEvenLinkedList {
    ListNode head;
    ListNode current;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    }
    public ListNode oddeven(ListNode head){
        if (head==null &&head.next==null){
            return head;
        }
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);
        ListNode evenTail = evenHead;
        ListNode oddTail = oddHead;
        int index = 1;
        ListNode current = head;
        while(current!=null){
            if (index%2==0){      /// ADD DATA Instead index here
                evenTail.next = current;
                evenTail = evenTail.next;
            }else{
                oddTail.next = current;
                oddTail = oddTail.next;
            }
            current = current.next;
            index++;
        }
        if (oddHead!=oddTail){
            oddTail.next =evenHead.next;
        }
        evenTail.next = null;

        return oddHead.next;
    }

    public void push(int data){
        ListNode list = new ListNode(data);
        if (head == null){

        }
    }
}
