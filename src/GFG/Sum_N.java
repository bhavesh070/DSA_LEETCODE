package GFG;

public class Sum_N {
    public static void main(String[] args) {
        System.out.println(sum1(5));
        System.out.println(sum2( 5));

    }
    public static int sum1(int n){
        return n*(n+1)/2;
    }
    public static int sum2(int n){
        int sum = 0;
        for (int i=0; i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
