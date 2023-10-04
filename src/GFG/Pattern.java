package GFG;

public class Pattern {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
    }
    public static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int i=1;i<=2*n-1 ;i++){
            int colinrow = i>n?2*n-i:i;
            for (int j=1;j<=colinrow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for (int i=1;i<=2*n-1;i++){
            int totalCol = i>n?2*n-i:i;
            int noOfSpaces = n-totalCol;
            for (int s =1;s<=noOfSpaces;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=totalCol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for (int row = 1; row<=2*n;row++){
            int c = row>n?2*n-row:row;
            for (int space = 0;space<n-c;space++){
                System.out.print("  ");
            }
            for (int col =c;col>=1;col--){
                System.out.print(col + " ");
            }
            for (int col=2;col<=c;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
