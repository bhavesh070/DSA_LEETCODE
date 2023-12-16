package PACKAGE_NAME.GFG.Array;

import java.util.Arrays;

public class SecondLarge {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 7};

        System.out.println(secLarge(arr));
        System.out.println(optimal(arr));
    }
    public static int secondLarge(int[] arr){  // wrong method if i get last  & second last element same this wont work;
        Arrays.sort(arr);
        int n= arr.length;
        return arr[n-2];
    }
    public static int secLarge(int[] arr){
        int large=arr[0];                      //  Brute force approach;
        for (int i=1;i< arr.length;i++){
            if (arr[i]>large){
                large=arr[i];
            }
        }
        int seclarge = Integer.MIN_VALUE;
        for (int j=0;j<arr.length;j++){
            if (arr[j]>seclarge && arr[j]!=large)
                seclarge=arr[j];
        }
        return seclarge;
    }
    public static int optimal(int[] arr){
        int large = arr[0];
        int sec = Integer.MIN_VALUE;
        for (int i=arr[1];i<arr.length;i++){
            if (arr[i]>large)
                sec=large;
                large=arr[i];
        }
        return sec;
    }
}