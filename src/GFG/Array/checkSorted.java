package PACKAGE_NAME.GFG.Array;

public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};
        System.out.println(isSorted(arr));
        System.out.println(IsSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        int smallest = arr[0];
        int largest = arr[n-1];
        for (int i=0;i<n;i++){
            if (arr[i]<smallest ){
                smallest=arr[i];
            }else if(arr[i]>largest){
                largest=arr[i];
            }
        }
        if (arr[0]==smallest && arr[n-1]==largest)
           return true;
        else
            return false;
    }
    public static boolean IsSorted(int[] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i]>=arr[i-1]){

            }else{
                return false;
            }
        }
        return true;
    }
}
