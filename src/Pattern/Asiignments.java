package PACKAGE_NAME.Pattern;

public class Asiignments {
    public static void main(String[] args) {
//        pat1(5);
//        pat2(5);
//        pat3(5);
//        pat4(5);
//        pat5(5);
//        pat6(5);
//        pat7(5);
//        pat8(5);
//        pat9(5);
//        pat10(5);
//        pat11(5);
        pat13(5);
    }
    static void pat1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat2(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat3(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat4(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    static void pat5(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat6(int n){
        for (int i=0;i<n;i++){
            //for spaces
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat7(int n){
        for (int i=0;i<n;i++){
            //for spaces
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat8(int n){
        for (int i=0;i<n;i++){
            //for space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat9(int n){
        for (int i=0;i<n;i++){
            //for spaces
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*(n-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat10(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat12(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pat13(int n) {
        for (int i = 0; i < n; i++) {
            //for spaces
            for (int j=0;j<n-i-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<n;j++){
                if ((i==4)||(i+j==4)||(j-i==4)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
