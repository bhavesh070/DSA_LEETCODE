package PACKAGE_NAME.GFG.StackQueue;

import java.util.ArrayList;

public class MinStack {
    ArrayList<Integer> stk = new ArrayList<>();

    public MinStack(){

    }
    public void push(int val){
        stk.add(val);
    }
    public  void pop(){
        int res = stk.get(stk.size()-1);
        stk.remove(stk.size()-1);
        System.out.println(res);
    }
    public int top(){
        return stk.get(stk.size()-1);
    }
    public int getMin(){
        int min = stk.get(0);
        for (int i=1;i<stk.size();i++){
            if (stk.get(i)<min){
                min = stk.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(3);
        obj.push(5);
        obj.push(2);
        obj.push(1);
        System.out.println("Top element: " + obj.top());
        System.out.println("Minimum element: " + obj.getMin());
        obj.pop();
        System.out.println("Top element after pop: " + obj.top());

    }
}
