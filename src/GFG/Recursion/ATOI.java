package PACKAGE_NAME.GFG.Recursion;

public class ATOI {
    public static void main(String[] args) {
        System.out.println(myaoti("   -230"));
        System.out.println(myAOTI("137cd03"));
        System.out.println(Integer.MAX_VALUE);
    }
    public static int myaoti(String s){
        char arr[] = s.toCharArray();
        int num = 0;
        for (int i=0;i<arr.length;i++){
            num = num* 10 + (arr[i]-'0');
        }
        return num;
    }
    public static int myAOTI(String s){
       char arr[] = s.toCharArray();
       int i = 0;
       while (i< arr.length && arr[i] == ' '){
           i++;
       }
       if(i>=arr.length){
           return 0;
       }
       int sign = 1;
       if (arr[i] == '-' || arr[i] == '+'){
           sign = (arr[i] == '+')?+1:-1;
           i++;
       }
       int num = 0;
       while (i<arr.length && Character.isDigit(arr[i])){
           int digit = arr[i] - '0';
           if (num>(Integer.MAX_VALUE - digit)/10){
               return (sign == 1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
           }
           num = num* 10+ digit;
           i++;
       }
       return num*sign;
    }
}
