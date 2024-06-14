package PACKAGE_NAME.GFG.Recursion;

public class Pow {
    public static void main(String[] args) {
        System.out.println(mypow(2,-2));
    }
    public static double mypow(double x , int n){
        if(n == 0){
            return 1;
        }
        double ans = 1;
        long N = Math.abs((long) n);
        for(int i=0;i<N;i++){
            ans *=x;
        }
        if(n<0){
            return 1/ans;
        }
        return ans;
    }
}
