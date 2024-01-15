package PACKAGE_NAME.GFG.LinkedList;

public class Main {

    public static void main(String[] args) {
        Node<Integer> head = createLinkedList(); // Assuming you have a method to create the linked list
        traverse(head);
    }

    static class Node<TreeNode> {
        TreeNode data;
        Node<TreeNode> next;

        Node(TreeNode data) {
            this.data = data;
        }
    }

    public static <TreeNode> void traverse(Node<TreeNode> head) {
        Node<TreeNode> curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    // Method to create a sample linked list
    public static Node<Integer> createLinkedList() {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        // Add more nodes as needed
        return head;
    }
}
