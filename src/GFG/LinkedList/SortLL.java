package PACKAGE_NAME.GFG.LinkedList;

import java.util.Arrays;

public class SortLL {
    public static void main(String[] args) {

    }
    public ListNode sortList(ListNode head) {
        int n = findSize(head);
        ListNode temp = head;
        int[] arr = new int[n];
        int i=0;
        while(temp!=null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        Arrays.sort(arr);
        temp = head;
        i=0;
        while(temp!=null){
            temp.val = arr[i++];
            temp = temp.next;
        }
        return head;
    }
    public int findSize(ListNode head){
        int size = 0;
        ListNode curr = head;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        return size;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
