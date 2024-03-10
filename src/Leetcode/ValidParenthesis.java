package PACKAGE_NAME.Leetcode;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        if ((s.length()&1)!=0){
            return false;
        }
        ArrayDeque<Character> el = new ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (c=='('|| c=='[' || c=='{'){
                el.push(c);
            }
            else if(c == ')' && !el.isEmpty() && el.peek()=='('){
                el.pop();
            }
            else if(c == ']' && !el.isEmpty()  && el.peek() == '['){
                el.pop();
            }
            else if(c == '}' && !el.isEmpty() && el.peek()=='{'){
                el.pop();
            }else {
                return false;
            }
        }
        return el.isEmpty();
    }
}
