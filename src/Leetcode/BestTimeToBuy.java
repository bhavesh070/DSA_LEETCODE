package PACKAGE_NAME.Leetcode;

public class BestTimeToBuy {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(arr));
        System.out.println(BestTime(arr));
    }

    public static int bestTime(int[] arr) {
        int n = arr.length;
        int profit = 0;
        int minimum = arr[0];
        for (int i=1;i<n;i++){
            if (arr[i]<minimum){
                minimum = arr[i];
            }else {
                profit = Math.max(profit,arr[i]-minimum);
            }
        }
        return profit;
    }
    public static int BestTime(int[] arr){
        int n = arr.length;
        int minimum = arr[0];
        int profit = 0;
        for (int i=1;i<n;i++){
            int cost = arr[i] - minimum;
            profit = Math.max(profit,cost);
            minimum = Math.min(minimum,arr[i]);
        }
        return profit;
    }
}
