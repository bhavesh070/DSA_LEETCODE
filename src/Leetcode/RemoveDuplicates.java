package PACKAGE_NAME.Leetcode;

public class RemoveDuplicates {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.next.val == curr.val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
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
