package PACKAGE_NAME.GFG.TEST.BIT;

public class Powerof2 {
    public static void main(String[] args) {

    }
    public static boolean isPowerofTwo(long n) {
        if(n==0){
            return false;
        }

        return ((n&(n-1))==0);
    }
}
