package PACKAGE_NAME.GFG.Array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {10,5,0,0,8,0,9,0};

        Move(arr);
    }
    public static void move(int[] arr){
        int n = arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]==0){
                for (int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        swap(arr,i,j);
                    }

                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr,int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void Move(int[] arr){
        int n= arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            if (arr[i]!=0){
                swap(arr,i,count);
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
