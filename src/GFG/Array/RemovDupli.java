package PACKAGE_NAME.GFG.Array;

public class RemovDupli {
    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,2,3,3};
        int length = Dupli(arr);
        for (int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int Dupli(int[] arr){
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return (i+1);
    }
}
