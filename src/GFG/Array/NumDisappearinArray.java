package PACKAGE_NAME.GFG.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class NumDisappearinArray {
    public static void main(String[] args) {

    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> sett = new HashSet<>();

        int n = nums.length;
        for(int num: nums){
            if(num>0 && num<=n){
                set.add(num);
            }
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                sett.add(i);
            }
        }
        return new ArrayList<>(sett);
    }
}
