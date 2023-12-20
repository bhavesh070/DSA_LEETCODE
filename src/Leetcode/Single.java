package PACKAGE_NAME.Leetcode;

public class Single {
    public static void main(String[] args) {
        int[] res = {2,2,1};
        System.out.println(Single(res));

    }
    public static int Single(int[] arr){
        int el = 0;
        boolean isflag = false;
        for (int i=0;i<arr.length;i++){
            isflag = false;
            for (int j=0;j<arr.length;j++){
                if (i!=j && arr[i] == arr[j]){
                    isflag=true;
                    break;
                }
            }
            if (!isflag){
                el = arr[i];
                break;
            }
        }
        return el;
    }
}
