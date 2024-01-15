package PACKAGE_NAME.Leetcode;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        reverse(arr);
        printArray(arr);

    }
    public static int[] reverse(int[] arr) {
        int i =0,j=arr.length-1;
        while (i<=j){
            swap(arr,i,j);
            i++;
            j--;
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
