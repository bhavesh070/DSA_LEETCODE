package PACKAGE_NAME.Leetcode;

public class FirstandLastOcurrence {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(searchRange(arr,target));

    }
    public static int[] searchRange(int[] nums, int target) {
        int firstIndex = binarySearch(nums, target, true);
        int lastIndex = binarySearch(nums, target, false);

        return new int[]{firstIndex, lastIndex};
    }

    private static int binarySearch(int[] arr, int x, boolean isFirst) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid;
                if (isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
