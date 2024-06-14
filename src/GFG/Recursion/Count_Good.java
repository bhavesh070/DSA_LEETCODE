package PACKAGE_NAME.GFG.Recursion;

public class Count_Good {
    public static void main(String[] args) {
        System.out.println(countGood(5));
    }
    public static int countGood(long n){    // brute force
        int mod = 1000000007;
        long ans = 1;
        for(long i=0;i<n;i++){
            if(i%2 == 0){
                ans = (ans * 5)% mod;
            }else{
                ans = (ans * 4) % mod;
            }
        }
        return  (int) ans;
    }
}
