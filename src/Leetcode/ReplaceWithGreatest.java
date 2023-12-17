package PACKAGE_NAME.Leetcode;

public class ReplaceWithGreatest {
    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
        int[] result = replaceElement(arr);
        for (int value:result){
            System.out.print(value+" ");
        }

    }
    public static int[] replaceElement(int[] arr){
        int n = arr.length;
        if(n==1){
            return new int[]{-1};
        }
        for (int i=0;i<n-1;i++){
            int maxRight = -1;
            for (int j=i+1;j<n;j++){
                maxRight = Math.max(maxRight,arr[j]);
            }
            arr[i] = maxRight;
        }
        arr[n-1] =-1;
        return arr;
    }
}
