package PACKAGE_NAME.Leetcode;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
    public static void sortColors(int[] nums) {
            int n = nums.length;
            for(int i=n-1;i>=1;i--){
                for(int j=0;j<=i-1;j++){
                    if(nums[j]>nums[j+1]){
                        swap(nums,j,j+1);
                    }
                }
            }
            printArray(nums);
        }
        public static void swap(int[] arr, int index1, int index2){
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

