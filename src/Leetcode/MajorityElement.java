package PACKAGE_NAME.Leetcode;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 3,3,3,2,1,2};
        System.out.println(MajorityElement(arr));
    }
    public static int MajorityElement(int[] arr){
        int streak = 0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            int temp = 1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    temp++;

                }
            }
            if (temp>streak){
                streak = temp;
                max = arr[i];
            }
        }
        return max;
    }
}
