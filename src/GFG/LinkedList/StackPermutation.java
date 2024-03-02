package PACKAGE_NAME.GFG.LinkedList;

import java.util.Scanner;
import java.util.Stack;
public class StackPermutation {
    public static boolean isStackPermutation(int[] original, int[] target) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        for (int element:original){
            stack.push(element);
            while (!stack.isEmpty() && stack.peek()==target[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] n1 = new int[n];
        for (int i=0;i<n;i++){
            n1[i] = sc.nextInt();
        }
        int[] n2 = new int[n];
        for (int j = 0;j<n;j++){
            n2[j] = sc.nextInt();
        }
        boolean result = isStackPermutation(n1,n2);
        System.out.println(result);
    }
}
