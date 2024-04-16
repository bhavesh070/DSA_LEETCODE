package PACKAGE_NAME.GFG.LinkedList;

import java.util.HashMap;

class liStnode {
    int data;
    liStnode Next;

    liStnode(int data, liStnode next){
        this.data = data;
        this.Next = next; // Assign next to the Next pointer
    }

}

public class Loop {
    public static void main(String[] args) {
        liStnode head = new liStnode(10, null); // Corrected to pass null as next for the first node
        head.Next = new liStnode(20, null);
        head.Next.Next = new liStnode(30, null);

        hasCycle(head);
    }
    public static boolean hasCycle(liStnode head){
        HashMap<liStnode, Integer> map = new HashMap<>(); // Corrected the HashMap declaration
        liStnode temp = head; // Corrected the type of temp to listnode
        while(temp!=null){
            if (map.containsKey(temp)){
                return true;
            }else{
                map.put(temp,0);
            }
            temp = temp.Next;
        }
        return false;
    }
}
