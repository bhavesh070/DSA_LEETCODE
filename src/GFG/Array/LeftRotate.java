package PACKAGE_NAME.GFG.Array;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        LeftRoby1(arr);


    }
    public static void  LeftRoby1(int[] arr){
        int temp = arr[0];
        int n = arr.length;
        for (int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for (int i=0;i< n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}