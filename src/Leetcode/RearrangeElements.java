package PACKAGE_NAME.Leetcode;

public class RearrangeElements {
    public static void main(String[] args) {
        int[] arr ={3,1,-2,-5,2,-4};
        Rearrange(arr);
        printArray(arr);
    }
    public static  int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int posindex = 0 , negindex = 0;
        for (int i=0;i<n;i++){
            if (nums[i]>0){
                pos[posindex++] = nums[i];
            }else {
                neg[negindex++] = nums[i];
            }
        }
        for (int i=0;i<n/2;i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
        }
        return nums;
    }
    public static void  printArray(int[] arr){
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
    public static int[] Rearrange(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int posindex = 0 , negindex = 1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans[posindex] = arr[i];
                posindex += 2;
            }else{
                ans[negindex] = arr[i];
                negindex += 2;
            }
        }
        return ans;
    }
}
