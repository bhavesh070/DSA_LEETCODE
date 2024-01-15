package PACKAGE_NAME.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>n/3 && !ls.contains(nums[i])){
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}
