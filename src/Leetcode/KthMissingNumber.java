package PACKAGE_NAME.Leetcode;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int target = 5;
        System.out.println(missing(arr,target));
    }
    public static int missing(int[] arr, int k){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid] - (mid+1);
            if (missing<k){
                low = mid+1;
            }else {
                high = mid - 1;
            }
        }
        return (high+1+k);
    }
}
