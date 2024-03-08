package PACKAGE_NAME.codechef;

import java.util.Scanner;
import java.util.Stack;

public class Necklace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int k = sc.nextInt();
            int p = sc.nextInt();
            Stack<Integer> stk = new Stack<>();
            for (int i=0;i<k;i++){
                stk.push(sc.nextInt());
            }
            Stack<Integer> temp = new Stack<>();
            for (int i =0;i<p;i++){
                temp.push(stk.pop());
            }
            while (!temp.isEmpty()){
                stk.push(temp.pop());
            }
            for (int i = 0; i < k; i++) {
                System.out.print(stk.get(i) + " ");
            }
            System.out.println();
        }
    }

}
