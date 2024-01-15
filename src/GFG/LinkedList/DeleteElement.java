package PACKAGE_NAME.GFG.LinkedList;

public class DeleteElement {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        traverse(head);
        head = delete(head, 3);
        traverse(head);
    }

    static class Node<TreeNode> {
        TreeNode data;
        Node<TreeNode> next;

        Node(TreeNode data) {
            this.data = data;
        }
    }

    public static Node<Integer> createLL() {
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        return head;
    }

    public static <TreeNode> void traverse(Node<TreeNode> head) {
        Node<TreeNode> curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node<Integer> delete(Node<Integer> head, int pos) {
        if (pos == 0) {
            return head.next;
        }
        Node<Integer> prev = head;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}
