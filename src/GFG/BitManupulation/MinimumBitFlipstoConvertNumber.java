package PACKAGE_NAME.GFG.BitManupulation;

import java.util.Scanner;

public class MinimumBitFlipstoConvertNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int goal = sc.nextInt();
        System.out.println(bitChange(start,goal));
    }
    public static int bitChange(int s, int g){
        int n = s ^ g;
        int count = 0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;

    }
}
