package PACKAGE_NAME.GFG.Array;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {2,3,-8,7,-1,2,3};
        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int MaxValue = arr[0];
        for (int i=0;i<arr.length;i++){
            int temp = 0;
            for (int j=i;j< arr.length;j++){
                temp = temp+ arr[j];
                MaxValue = Math.max(MaxValue,temp);
            }
        }
        return MaxValue;
    }
}
