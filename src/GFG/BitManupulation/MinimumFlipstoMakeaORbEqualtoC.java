package PACKAGE_NAME.GFG.BitManupulation;

public class MinimumFlipstoMakeaORbEqualtoC {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = 5;
        System.out.println(minimumFlips(a,b,c));
    }
    public static int minimumFlips(int a , int b , int c){
        int count = 0;
        while (a>0 || b> 0 || c>0){
            int abit = a&1;
            int bbit = b&1;
            int cbit = c&1;

            if (cbit == 0){
                count += abit+bbit;
            }else {
                if (abit == 0 && bbit == 0){
                    count+=1;
                }
            }
            a = a>>1;
            b = b>>1;
            c = c>>1;
        }
        return count;

    }
}
