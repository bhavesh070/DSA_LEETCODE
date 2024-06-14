package PACKAGE_NAME.GFG.Recursion;

public class Pow {
    public static void main(String[] args) {
        System.out.println(mypow(2,-2));
        System.out.println(myPOW(2,-2));
    }
    public static double mypow(double x , int n){   // brute force approach
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
    public static double myPOW(double x, int n){
         // optimized recursive approach
        if(n==0){
            return 1;
        }
        double ans = 1;
        Long N = Math.abs((long) n);
        while (N>0){
            if(N%2==0){
                 x = x*x;
                 N = N/2;
            }
            ans = ans*x;
            N = N-1;
        }
        if(n<0){
            return 1/ans;
        }
        return ans;

    }
}
