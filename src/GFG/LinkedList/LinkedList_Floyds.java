package PACKAGE_NAME.GFG.LinkedList;

import java.sql.Statement;
import java.util.*;
public class LinkedList_Floyds {
    static Node head;
    static class Node{
        int num;
        Node next;
        Node(int val){
            num = val;
            next = null;
        }
    }
    public static void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head=new_node;
    }
    public static boolean detect(Node h){
        Node fast = h;
        Node slow = h;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList_Floyds list  = new LinkedList_Floyds();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            int val = sc.nextInt();
            list.push(val);

        }
        Node lastNode = list.head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = list.head;

        // Detect cycle in the linked list
        if (list.detect(list.head))
            System.out.println("Cycle detected");
        else
            System.out.println("Cycle not detected");
    }
}