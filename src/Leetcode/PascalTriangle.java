package PACKAGE_NAME.Leetcode;

public class PascalTriangle {
    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        int res = ncr(r,c);
        System.out.println(res);
    }
    public static int ncr(int n,int r){
        int res =1;
        for (int i=0;i<r;i++){
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }
}
