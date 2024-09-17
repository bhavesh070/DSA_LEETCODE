package PACKAGE_NAME.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class osumania {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int test = sc.nextInt();
        while (test--!=0){
            int n = sc.nextInt();
            String[] str = new String[n];
            for (int i=0;i<n;i++){
                str[i] = sc.next();
            }
            sc.close();
            System.out.println(listall(str));
        }
    }
    public static List<Integer> listall(String[] str){
        int ans = 0;
        int n = str.length;
        List<Integer> arr = new ArrayList<Integer>();
        for (int i=n-1;i>=0;i--){

        }
        return arr;
    }
}
