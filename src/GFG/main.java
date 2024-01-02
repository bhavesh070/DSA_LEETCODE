package PACKAGE_NAME.GFG;

public class main {
    public static void main(String[] args) {
        int[] arr = { 6,3,9,1,53,5};

        printArray(ALL(arr));
    }
    public static int Largest(int[] arr){
        int lar = arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>lar){
                lar = arr[i];
            }
        }
        return lar;
    }
    public static int SecondLarge(int[] arr){
        int secLar = arr[1];
        int lar = arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                secLar = lar;
                lar = arr[i];
            }
        }
        return secLar;
    }
    public static void printArray(int[]arr){
        for (int vale: arr){
            System.out.print(vale+" ");
        }
    }
    public static int secondSmall(int[] arr){
        int secSmal = arr[1];
        int small = arr[0];
        for(int i=0;i< arr.length;i++){
            if (arr[i]<small){
                secSmal = small;
                small =arr[i];

            }
        }
        return secSmal;
    }
    public static int[] ALL(int[] arr){
        return new int[]{secondSmall(arr),SecondLarge(arr)};
    }
}
