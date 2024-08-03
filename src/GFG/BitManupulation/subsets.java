package PACKAGE_NAME.GFG.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int total = (int) Math.pow(2,n);

        for(int i=0;i<total;i++){
            List<Integer> sub = new ArrayList<>();
            for(int bit = 0; bit<n; bit++){
                int magic = (1 << bit);
                if((i & magic) !=0 )
                    sub.add(nums[bit]);
            }
            result.add(sub);
        }
        return result;
    }
}
