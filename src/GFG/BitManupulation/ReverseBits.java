package PACKAGE_NAME.GFG.BitManupulation;

public class ReverseBits {
    public static void main(String[] args) {

    }
    public int reverseBits(int n){
        int ans = 0;
        int cnt = 31;
        for (int i=0;i<32;i++){
            if ((n&1)==1){
                ans = ans | (1<<cnt);
                cnt--;
            }else {
                cnt--;
            }
            n = n>>1;
        }
        return ans;

    }
}
