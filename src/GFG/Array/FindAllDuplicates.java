package PACKAGE_NAME.GFG.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {

    }
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate= new HashSet<>();

        int n = nums.length;
        for(int num: nums){
            if(set.contains(num)){
                duplicate.add(num);

            }
            set.add(num);
        }
        return new ArrayList<>(duplicate);
    }
}
