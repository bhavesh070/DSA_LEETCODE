package GFG;

public class Sum_N {
    public static void main(String[] args) {
        System.out.println(sum1(5));
        System.out.println(sum2( 5));
        System.out.println(sum3(5));

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
    public static int sum3(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                sum++;
            }
        }
        return sum;
    }
}
