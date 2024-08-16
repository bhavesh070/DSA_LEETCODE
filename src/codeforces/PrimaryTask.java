package PACKAGE_NAME.codeforces;

import java.util.Scanner;
import java.util.Stack;

public class PrimaryTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t--!=0) {
            int a = sc.nextInt();
            String b = Integer.toString(a);
            if (b.startsWith("10")){
                if (b.length()==4){
                    String lastTwoDigits = b.substring(b.length() - 2);
                    if ( Integer.parseInt(lastTwoDigits) > 2){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
                if (b.length()==3){
                    String lastTwoDigits = b.substring(b.length() - 1);
                    if ( Integer.parseInt(lastTwoDigits) > 2){
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
                if (b.length()==5) {
                    String lastTwoDigits = b.substring(b.length() - 3);
                    if (Integer.parseInt(lastTwoDigits) > 2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }else
                System.out.println("NO");
        }
    }
}
