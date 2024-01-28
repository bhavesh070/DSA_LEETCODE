package PACKAGE_NAME.GFG.Array;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {

    }
        public int findDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int num:nums){
                if(set.contains(num)){
                    return num;
                }
                set.add(num);
            }
            return 0;
        }
    }

