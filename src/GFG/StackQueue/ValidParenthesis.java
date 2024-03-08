package PACKAGE_NAME.GFG.StackQueue;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid (String s){
        if((s.length() & 1) != 0){
            return false;
        }
        ArrayDeque<Character> stk = new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stk.push(c);
            }
            else if(c == ')' && !stk.isEmpty() && stk.peek() == '('){
                stk.pop();
            }
            else if ( c == '}' && !stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            }
            else if ( c == ']' && !stk.isEmpty() && stk.peek() == '['){
                stk.pop();
            }else {
                return false;
            }
        }
        return stk.isEmpty();
    }
}
