package PACKAGE_NAME.GFG.Recursion;

public class ATOI {
    public static void main(String[] args) {
        System.out.println(myaoti("4213"));
    }
    public static int myaoti(String s){
        char arr[] = s.toCharArray();
        int num = 0;
        for (int i=0;i<arr.length;i++){
            num = num* 10 + (arr[i]-'0');
        }
        return num;
    }
}
