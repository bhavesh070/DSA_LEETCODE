package PACKAGE_NAME.Leetcode;

public class TwoSum {
    public static void main(String[] args) {
        int[] r = {2,7,11,15};
        int tar = 9;
        System.out.println(twoSum(r,tar));
    }
    public static int[] twoSum(int[] arr,int target){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
