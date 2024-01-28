package PACKAGE_NAME.GFG.LinkedList;

public class LinkedListCycleII {
    public static void main(String[] args) {

    }
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast==slow){
                    ListNode ptr = head;
                    while(ptr!=slow){
                        slow = slow.next;
                        ptr = ptr.next;
                    }
                    return ptr;
                }
            }
            return null;
        }
    }
}
