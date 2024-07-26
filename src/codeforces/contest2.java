package PACKAGE_NAME.codeforces;

import java.util.Scanner;

public class contest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k==0){
                System.out.println(0);
            }
            int res = k/n + 1;
            if (k==9){
                System.out.println(res+1);
            }else {
                System.out.println(res);
            }
        }
    }
}
