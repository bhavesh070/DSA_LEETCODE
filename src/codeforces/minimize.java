package PACKAGE_NAME.codeforces;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int sum = 0;
        while (test--!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b){
                System.out.println(0);
            }else {
                System.out.println(minimized(a,b));
            }
        }
    }
    public static int minimized(int a , int b){
        return b-a;
    }
}
