package PACKAGE_NAME.Leetcode;
import java.util.HashMap;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(int val:nums){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
            if(map.get(val)>maxFreq){
                maxFreq = Math.max(maxFreq,map.get(val));
            }
        }
        return (maxFreq>1);
    }

}
