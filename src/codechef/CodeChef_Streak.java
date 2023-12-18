package PACKAGE_NAME.codechef;

import java.util.Scanner;

public class CodeChef_Streak {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Om = new int[n];
        int[] Addy = new int[n];
        for (int i=0;i<n;i++){
            Om[i]  = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            Addy[i] = sc.nextInt();
        }
        int om = Streak(Om);
        int addy = Streak(Addy);

        if(om > addy){
            System.out.println("Om");
        }else if(om==addy){
            System.out.println("Draw");
        }else {
            System.out.println("Addy");
        }
    }
    public static int Streak(int[] arr){
        int streak = 0;
        int temp = 0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                temp++;
            }else {
                temp=0;
            }
            if (streak<temp){
                streak = temp;
            }
        }
        return streak;
    }
}


