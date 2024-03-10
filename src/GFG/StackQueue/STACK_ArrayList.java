package PACKAGE_NAME.GFG.StackQueue;

import java.util.ArrayList;

import java.util.ArrayList;

class mystack {
    ArrayList<Integer> stk = new ArrayList<>();

    public mystack(){

    }
    public void push(int val){
        stk.add(val);
    }
    public int peek(){
       return (stk.size()-1);
    }
    public int pop(){
        if(stk.isEmpty()){
            return -1;
        }
        int res = stk.get(stk.size()-1);
        stk.remove(stk.size()-1);
        return res;
    }
    public int size(){
        return stk.size();
    }
    public boolean isEmpty(){
        return stk.isEmpty();
    }
}
public class STACK_ArrayList {
    public static void main(String[] args) {
        mystack s = new mystack();
        s.push(5);
        s.push(15);
        s.push(25);
        System.out.println(s.peek());
        System.out.println(s.pop());

        s.push(35);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
