package PACKAGE_NAME.GFG.BitManupulation;

public class SingleNumberII {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int maxbit = 32;
        int countSetBit[] = new int[maxbit];
        for(int num:nums){
            for(int bitpos = 0;bitpos<maxbit;bitpos++){
                if((num&(1<<bitpos))!=0){
                    countSetBit[bitpos]++;
                }
            }
        }
        int single = 0;
        for(int i=0;i<maxbit;i++){
            if(countSetBit[i]%3!=0){
                single |= (1<<i);
            }
        }
        return single;
    }
}
