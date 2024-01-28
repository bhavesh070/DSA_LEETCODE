package PACKAGE_NAME.GFG.LinkedList;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        // Your main method implementation
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);
        ListNode oddTail = oddHead;
        ListNode evenTail = evenHead;
        int index = 1;
        ListNode current = head;

        while (current != null) {
            if (index % 2 == 0) {
                evenTail.next = current;
                evenTail = evenTail.next;
            } else {
                oddTail.next = current;
                oddTail = oddTail.next;
            }
            current = current.next;
            index++;
        }

        oddTail.next = evenHead.next;
        evenTail.next = null;

        return oddHead.next;
    }

    class ListNode {
        int data;
        ListNode next;  // Fix: Change 'int next' to 'ListNode next'

        ListNode(int data) {
            this.data = data;
        }
    }
}
