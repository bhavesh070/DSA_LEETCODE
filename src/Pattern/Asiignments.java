package PACKAGE_NAME.Pattern;

public class Asiignments {
    public static void main(String[] args) {
        pat1(5);
        pat2(5);
        pat3(5);
        pat4(5);
        pat5(5);
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
}
