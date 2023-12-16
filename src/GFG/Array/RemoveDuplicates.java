package PACKAGE_NAME.GFG.Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr ={1,1,2};
        NotSorted(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void remove(int[] arr){
        int n= arr.length;
        HashSet<Integer> unique = new HashSet<>();
        for (int i=0;i<n;i++){
            unique.add(i);
        }
        for (int i=0;i<n;i++){
            arr[i]=0;
        }
        int index = 0;
        for (int  uniquElements : unique) {
            arr[index++]=uniquElements;
        }
        System.out.println(arr);
    }
    public static void removeDuplicates(int[] arr) {
        // Create a set to store unique elements
        HashSet<Integer> uniqueSet = new HashSet<>();

        // Iterate through the array and add each element to the set
        for (int i = 0; i < arr.length; i++) {
            uniqueSet.add(arr[i]);
        }

        // Clear the original array
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 0;
        }

        // Reconstruct the array with unique elements from the set
        int index = 0;
        for (Integer uniqueElement : uniqueSet) {
            arr[index++] = uniqueElement;
        }
    }
    public static int NotSorted(int[] arr){
        Arrays.sort(arr);
        int i=0;
        for (int j=0;j< arr.length;j++){
            if (arr[i]!=arr[j]){
                arr[i++] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
}
