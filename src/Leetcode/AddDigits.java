package PACKAGE_NAME.Leetcode;

public class AddDigits {
    public static void main(String[] args) {

    }
    public int addDigits(int num) {
        int sum = 0;
        while(num!=0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if(sum>=10){
            return addDigits(sum);
        }
        return sum;
    }
}
