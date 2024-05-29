package PACKAGE_NAME.GFG.Array;
import java.util.*;

public class FiBO {
    public static void main(String[] args) {
        Scanner scv = new Scanner(System.in);
//        int n = scv.nextInt();
//        int res = fibo(n); // Pass 'n' instead of '5'
        System.out.println(5);
    }
    public static int fibo(int n){
        if (n == 0 || n == 1){
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
