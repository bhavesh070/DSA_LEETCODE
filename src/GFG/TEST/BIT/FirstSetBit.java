package PACKAGE_NAME.GFG.TEST.BIT;

public class FirstSetBit {
    public static void main(String[] args) {

    }
    public static int getFirstSetBit(int n){

        int i = 1;
        while(n>0){
            if((n & 1) !=0){
                return i;
            }
            i++;
            n = n >> 1;
        }
        return 0;

    }
}
