package PACKAGE_NAME.Pattern;

public class Task1 {
    public static void main(String[] args) {
        pattern1(4);
        pater1(5);
    }

    public static void pattern1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void pater1(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("0 ");
            }
            System.out.println();
        }

    }
}
