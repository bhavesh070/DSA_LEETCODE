package PACKAGE_NAME.GFG.Array;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        List<Integer> leaders = findLeaders(arr);
        System.out.println(leaders);
    }
    public static List<Integer> findLeaders(int[] arr){
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        for (int i=0;i<n;i++){
            boolean isLeader = true;
            for (int j= i+1;j<n;j++){
                if (arr[i] <=arr[j]){
                    isLeader = false;
                    break;
                }
            }
            if (isLeader){
                leaders.add(arr[i]);
            }
        }
        return leaders;

    }
}
