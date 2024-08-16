package PACKAGE_NAME.GFG.TEST.BIT;

public class Rightmostdifferentbit {
    public static int posOfRightMostDiffBit(int m, int n) {

        if (m == n) {
            return -1;
        }
        int neww = m ^ n;
        int count = 1;
        while (neww > 0) {
            if ((neww & 1) != 0) {
                return count;
            }
            count++;
            neww = neww >> 1;
        }
        return count;
    }
}
