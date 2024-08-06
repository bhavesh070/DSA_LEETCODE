package PACKAGE_NAME.codeforces;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0;i<test;i++){
            int val = sc.nextInt();
            int sum = val%10 + val/10;
            System.out.println(sum);
        }
    }
}
