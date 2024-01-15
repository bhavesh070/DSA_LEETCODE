package PACKAGE_NAME.GFG.LinkedList;

public class TraverseLL {
    public static void main(String[] args) {
        Node<Integer> head = createLL();
        traverse(head);
    }
    static class Node<TreeNode>{
        TreeNode data;
        Node<TreeNode> next;
        Node(TreeNode data){
            this.data = data;
        }
    }
    public static <TreeNode> void traverse(Node<TreeNode> head){
        Node<TreeNode> curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    public static Node<Integer> createLL(){
        Node<Integer> head = new Node<>(1);
        head.next = new Node<>(2);
        head.next.next = new Node<>(3);
        return head;
    }
}
