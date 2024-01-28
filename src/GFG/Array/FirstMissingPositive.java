package PACKAGE_NAME.GFG.Array;

import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String[] args) {

    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0 && num <= n) {
                set.add(num);
            }
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return n + 1;
    }
}
