package PACKAGE_NAME.GFG;

import java.util.Scanner;

import java.util.*;


import java.util.*;

class Node {
    int num;
    Node next;
    Node(int val) {
        num = val;
        next = null;
    }
}

class Main {
    static Node insert(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.num + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    static void cycle(Node head, int a) {
        Node p1 = head, p2 = head;
        for (int i = 0; i < a; i++) p2 = p2.next;
        while (p1 != p2) p1 = p1.next; p2 = p2.next;
        while (p1.next != p2) p1 = p1.next;
        p1.next = null;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n; i++) head = insert(head, sc.nextInt());
        display(head);
        int a = sc.nextInt();
        cycle(head, a);
        if (cycleDetect(head)) System.out.println("Cycle detected");
        else System.out.println("Cycle not detected");
    }

    static boolean cycleDetect(Node head) {
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
