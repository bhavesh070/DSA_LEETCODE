package PACKAGE_NAME.Leetcode;

public class NumberswithEvenDigits {
    public static void main(String[] args) {

    }
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(evendigit(nums[i])){
                count++;
            }

        }
        return count;
    }
    public static boolean evendigit(int n){
        int count=0;
        boolean istrue = false;
        while(n!=0){
            n=n/10;
            count++;
        }
        if(count%2==0){
            istrue = true;
        }
        return (istrue);
    }
}
