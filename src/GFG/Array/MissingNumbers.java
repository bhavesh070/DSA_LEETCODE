package PACKAGE_NAME.GFG.Array;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = n*(n+1)/2;
        int actualSum = 0;
        for(int num:nums){
            actualSum+=num;
        }
        return sum-actualSum;
    }
}
