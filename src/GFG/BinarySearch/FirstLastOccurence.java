package PACKAGE_NAME.GFG.BinarySearch;

public class FirstLastOccurence {
    public static void main(String[] args) {
        int [] arr = {5,10,10,15,20,20,20};
        int target = 20;
        System.out.println(First(arr,target));
        System.out.println(Last(arr,20));
    }
    public static int First(int[] arr,int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (high+low)/2;
            if (arr[mid]==x){
                if (arr[mid-1]==x){
                    return mid-1;
                }
            }else if(arr[mid]>x){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }
    public static int Last(int[] arr, int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid = (high+low)/2;
            if(arr[mid]==x){
                if(arr[mid+1]==x){
                    return mid+1;
                }
            }else if(arr[mid]>x){
                high = mid-1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
