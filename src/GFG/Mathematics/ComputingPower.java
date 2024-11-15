package PACKAGE_NAME.GFG.Mathematics;

import java.util.Scanner;

public class ComputingPower{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int ans = (int) Math.pow(n,p);
        System.out.println(ans);

    }

}
