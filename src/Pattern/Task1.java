package PACKAGE_NAME.Pattern;

public class Task1 {
    public static void main(String[] args) {
        pattern1(4);
    }

    public static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
