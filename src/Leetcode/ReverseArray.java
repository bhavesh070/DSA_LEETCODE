package PACKAGE_NAME.Leetcode;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        Reverse(arr);
        printArray(arr);

    }
    public static int[] Reverse(int[] arr){
        int n= arr.length;
        for (int i=0;i<n/2||i<n/2+1;i++){
          swap(arr,i,n-1-i);
        }
        return arr;
    }
    public static void printArray(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void swap(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = arr[temp];
    }
}
