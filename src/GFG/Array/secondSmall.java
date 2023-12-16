package PACKAGE_NAME.GFG.Array;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class secondSmall {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 8, 4};
        System.out.println(small(arr));
        System.out.println(sm(arr));
        System.out.println(SEC(arr));


    }

    public static int small(int[] arr) { // with sorting
        Arrays.sort(arr);
        return arr[1];
    }

    public static int sm(int[] arr) {
        int small = Integer.MAX_VALUE; /// Brute force approach
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        int sec = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < sec && arr[i] != small)
                sec = arr[i];
        }
        return sec;
    }

    public static int SEC(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<smallest){
                secSmallest=smallest;
                smallest=arr[i];
            }else if (arr[i]<secSmallest && arr[i] != smallest)
                secSmallest=arr[i];
        }
        return secSmallest;
    }
}