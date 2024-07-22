package PACKAGE_NAME.GFG.Recursion;

public class Count_Good {
    public static void main(String[] args) {
        System.out.println(countGood(5));
        System.out.println(countGreatNumber(5));
        System.out.println(countGoodNumbers(5));
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
    public static int countGoodNumbers(long n) {
        int mod = 1000000007;
        long a = n/2 + n%2;
        long b = n/2;
        return (int) ((myPow(5,a,mod)*myPow(4,b,mod))%mod);
    }
    public static long myPow(long x, long n, int mod){
        if(n==0){
            return 1;
        }
        long temp = myPow(x,n/2,mod);
        int tempo = 5;
        if(n%2==0){
            return (temp*temp)%mod;
        }else{
            if(n>0){
                return (temp*temp*x)%mod;
            }else{
                return (temp*temp*1/x)%mod;
            }
        }
    }
    public static int countGreatNumber(long n){
        int mod = 100000007;
        long a = n/2 + n%2;
        long b = n/2;
        return (int) ((power(5,a,mod)*power(4,b,mod))%mod);
    }
    public static long power(long x , long n , int mod){
        if(n==0){
            return 1;
        }
        long temp = power(x,n/2,mod);
        if(n%2==0){
            return temp*temp;
        }else {
            if(n>0){
                return temp*temp*x;
            }else {
                return temp*temp*1/x;
            }
        }
    }
}
