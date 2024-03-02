package PACKAGE_NAME.Leetcode;

public class SumOfTwo_BIT {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println(addTwoNum(a,b));
    }
    public static int addTwoNum(int a , int b){
        while (b!=0){
            int carry = a & b;
            a = a ^b;
            b = carry<<1;
        }
        return a;
    }
}
