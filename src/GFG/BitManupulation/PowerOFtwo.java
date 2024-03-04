package PACKAGE_NAME.GFG.BitManupulation;

public class PowerOFtwo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(ispower(x));
    }
    public static boolean ispower(int x){
        if(x==0 || x==Integer.MIN_VALUE){
            return false;
        }else {
            return (x & (x-1))==0;
        }
    }
}
