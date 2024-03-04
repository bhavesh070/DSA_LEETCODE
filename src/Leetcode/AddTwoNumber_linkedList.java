package PACKAGE_NAME.Leetcode;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode() {
        this.next = next;
    }
}

public class AddTwoNumber_linkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ListNode l1 = createLinkedList(sc,n);
        ListNode l2 = createLinkedList(sc,n);

        ListNode result = addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
            return;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }
    public static ListNode createLinkedList(Scanner sc, int n){
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int i=0;i<n;i++){
            int val = sc.nextInt();
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }
}
