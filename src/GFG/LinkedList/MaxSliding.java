package PACKAGE_NAME.GFG.LinkedList;

import java.util.Scanner;

public class MaxSliding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i=0;i<n;i++){
            data[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] result  = max(data,k);
        for (int num:result){
            System.out.print(num+" ");
        }
    }
    public static int[] max(int[] nums, int k){
        if (nums.length==0||nums==null)return new int[0];
        int n = nums.length;
        int[]result = new int[n-k+1];
        for (int i=0;i<n-k;i++){
            int max = Integer.MIN_VALUE;
            for (int j=i;j<i+k;j++){
                max = Math.max(max,nums[j]);
            }
            result[i] = max;
        }
        return result;
    }
}
