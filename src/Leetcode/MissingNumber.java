package PACKAGE_NAME.Leetcode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        boolean isflag = false; // Move the declaration outside the loop
        int i; // Declare 'i' outside the loop
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != count) {
                isflag = true;
                break;
            }
            count++;
        }
        if (!isflag) {
            return nums.length; // Return the missing number when the loop completes
        } else {
            return count;
        }
    }
}