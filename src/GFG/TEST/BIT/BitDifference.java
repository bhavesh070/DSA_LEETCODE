package PACKAGE_NAME.GFG.TEST.BIT;

public class BitDifference {
    public static int countBitsFlip(int a, int b){
        int neww = a^b;
        int count = 0;
        while(neww>0){
            neww = neww & (neww - 1);
            count ++;
        }
        return count;
    }
}
