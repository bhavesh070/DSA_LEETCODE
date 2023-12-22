package PACKAGE_NAME.codechef;

import java.util.Scanner;

public class ChefandDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        int xor = 0;
        while (Test-->0){
            int count = 0;
            int c = sc.nextInt();
            for (int i=0;i<c;i++){
                int k = sc.nextInt();
                xor ^= k;
            }
            System.out.println(xor);
        }

    }
}
