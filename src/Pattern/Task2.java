package PACKAGE_NAME.Pattern;

public class Task2 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
