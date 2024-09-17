package PACKAGE_NAME.Leetcode;

import java.util.HashMap;

public class MaxFreqElement {
    public static void main(String[] args) {

    }
    public int maxFrequencyElements(int[] nums) {
        int maxFreq = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
            if(map.get(num)>maxFreq){
                maxFreq  = Math.max(maxFreq, map.get(num));
            }
        }
        int ans = 0;
        for(int el:map.values()){
            if(el == maxFreq){
                ans += el;
            }
        }
        return ans;
    }

}
