package PACKAGE_NAME.GFG.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {-1,0,3,5,9,12};
        int x = 9 ;
        System.out.println(LinearSearch(arr,x));
        System.out.println(binary(arr,x));
        int n = arr.length;
        int low = 0;
        int high = n-1;
        System.out.println("Enter target");
        int target = sc.nextInt();
        System.out.println(Bin(arr,target,low,high));
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
    public static int Bin(int[] arr, int target, int low, int high){
        if(low>high)return -1;
        int mid = (low+high)/2;
        if(arr[mid]==target){
            return mid;                 /// RECURSIVE METHOD
        }else if(arr[mid]>target){
            return Bin(arr,target,low,mid-1);
        }else {
            return Bin(arr,target,mid+1,high);
        }
    }
}
