package PACKAGE_NAME.Leetcode;

public class RemoveDuplicatesII {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        while(head!=null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
    class ListNode{
        int val;
        ListNode next;
        ListNode(int n, ListNode head){
            val = n;
            next = null;
        }
    }
}
