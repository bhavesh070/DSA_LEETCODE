package PACKAGE_NAME.GFG.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        int x = 9 ;
        System.out.println(LinearSearch(arr,x));
        System.out.println(binary(arr,x));
    }
    public static int LinearSearch(int[] arr,int x){
        for (int i=0;i<arr.length;i++){
            if (arr[i] ==x){
                return i;
            }
        }
        return -1;
    }
    public static int binary(int[] arr, int x){
        int n =arr.length;
        int high = n-1;
        int low = 0;
        while (low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
}
