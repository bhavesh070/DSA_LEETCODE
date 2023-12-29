package PACKAGE_NAME.Leetcode;

public class SingleElement {
    public static void main(String[] args) {
       int[] arr = {12,2,3,4,5,5};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int xor = 0;
        for(int num:nums){
            xor = xor ^ num;
        }
        return xor;
    }
}
