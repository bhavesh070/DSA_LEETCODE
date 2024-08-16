package PACKAGE_NAME.codeforces;

import java.util.Scanner;

public class SeatinginaBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0){
            boolean flag = false;
          int a = sc.nextInt();
          int [] arr = new int[a];
          for (int i=0;i<a;i++){
              arr[i] = sc.nextInt();
          }
          for (int i=1;i<arr.length;i++){
           for (int j = 0 ;j<i;j++){
               if (arr[i]-1==arr[j] || arr[i]+1 == arr[j]){
                   flag = true;
               }
               else
                   flag = false;
           }
          }
            if (flag==true){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
