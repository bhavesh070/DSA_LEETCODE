package PACKAGE_NAME.Leetcode;

public class AlternatingDigitSum {
    public static void main(String[] args) {
        int n = 521;
        System.out.println(alternateDigitSum(n));
    }
    public static int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int digit = Character.getNumericValue(s.charAt(i));
            if(i%2==0){
                sum += digit;
            }else{
                sum -= digit;
            }
        }
        return sum;
    }
}