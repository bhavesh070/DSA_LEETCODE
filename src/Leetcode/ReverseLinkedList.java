package PACKAGE_NAME.Leetcode;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode front;

        while (temp != null) {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int n){
            val = n;
            next = null;
        }
    }
}
