package PACKAGE_NAME.GFG.Array;

import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestEL {
    public static void main(String[] args) {
        int[] arr = { 7,1,5,2,8};
        System.out.println(Largest(arr));
        System.out.println(LARG(arr));
    }
    public static int Largest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int LARG(int[] arr){
        int max= arr[0];
        for (int i=0;i<arr.length;i++){
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
