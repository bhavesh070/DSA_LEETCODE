package PACKAGE_NAME.GFG.Array;

import java.util.*;

public class UnionOfArrays {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5};
        int[] brr = {2, 3, 4, 5, 6, 7};
        Set<Integer> list = findUnion(arr,brr);
        for (int value:list){
            System.out.print(value+" ");
        }

    }

    public static Set<Integer> findUnion(int[] arr, int[] brr) {
        Set<Integer> list = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for (int i=0;i< brr.length;i++){
            list.add(brr[i]);
        }
        return list;
    }
}

