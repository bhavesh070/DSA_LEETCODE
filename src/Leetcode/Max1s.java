package PACKAGE_NAME.Leetcode;

public class Max1s {
    public static void main(String[] args) {
        int[] arr = { 1,0,1,1,1,0,1};
        System.out.println(max(arr));
    }
    public static int max(int[] arr) {
        int temp = 0;
        int streak = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp++;
            } else {
                temp = 0;
            }
            if (streak < temp) {
                streak = temp;
            }
        }
        return streak;
    }
}
