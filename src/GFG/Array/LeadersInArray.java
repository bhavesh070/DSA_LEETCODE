package PACKAGE_NAME.GFG.Array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int [] arr = { 18,10,1,5,6};
        int[] result = replaceElement(arr);
        for (int value: result){
            System.out.print(value+" ");
        }
    }
    public static int[] replaceElement(int[] arr){
        if(arr.length==1){
            return new int[]{-1};
        }
        List<Integer> result = leader(arr);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static List<Integer> leader(int[] arr){
        List<Integer> Leader = new ArrayList<>();
        int n = arr.length;
        for (int i=0;i<n;i++){
            boolean isLeader = false;
            for (int j=i+1;j<n;j++){
                if (arr[i]<=arr[j]){
                    isLeader = true;
                    break;
                }
            }
            if (!isLeader){
                Leader.add(arr[i]);
            }
        }
        return Leader;
    }
}
