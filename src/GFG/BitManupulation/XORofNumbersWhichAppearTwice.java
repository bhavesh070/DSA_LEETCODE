package PACKAGE_NAME.GFG.BitManupulation;

import java.util.Arrays;

public class XORofNumbersWhichAppearTwice {
    public static void main(String[] args) {

    }
    public int duplicateNumbersXOR(int[] nums) {
        int xor = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                xor = xor ^ nums[i];
            }
        }
        return xor;
    }
}
