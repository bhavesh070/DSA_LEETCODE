package PACKAGE_NAME.GFG.Array;

public class MaxSubArray {
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(max(arr));
        System.out.println(Max(arr));
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
    public static int Max(int[] arr){
        int MaxValue = arr[0];
        int res = arr[0];
        for (int i=1;i<arr.length;i++){
            MaxValue = Math.max(MaxValue+arr[i],arr[i]);
            res = Math.max(res,MaxValue);
        }
        return res;
    }
}
