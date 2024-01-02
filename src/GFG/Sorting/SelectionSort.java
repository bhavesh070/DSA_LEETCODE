package PACKAGE_NAME.GFG.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,53,20,9};
        selectionSort(arr);
        printArray(arr);
    }
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<=n-2;i++){
            int min = i;
            for (int j=i;j<=n-1;j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
                swap(arr,i,min);
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
