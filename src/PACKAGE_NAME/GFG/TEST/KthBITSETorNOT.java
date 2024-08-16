package PACKAGE_NAME.PACKAGE_NAME.GFG.TEST;

public class KthBITSETorNOT {
    public static void main(String[] args) {

    }
    public static boolean checkKthBit(int n, int k) {
        return ((n & (1<<k) )!= 0);
    }
}
