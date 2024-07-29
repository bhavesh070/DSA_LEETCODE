package PACKAGE_NAME.GFG.BitManupulation;

public class Divide2Intger {
    public static void main(String[] args) {
        
    }
    public static int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        if(dividend == 0){
            return 0;
        }
        return dividend / divisor;
    }
}

