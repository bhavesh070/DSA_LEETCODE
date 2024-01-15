package PACKAGE_NAME.Leetcode;

public class MIddleLinkedList {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
