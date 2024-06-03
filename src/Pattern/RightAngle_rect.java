package PACKAGE_NAME.Pattern;

public class RightAngle_rect {
    public static void main(String[] args) {
        RectPat(4);
        RighAnglePaT(4);
        RightAngleMirror(4);
    }
    static void RectPat(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void RighAnglePaT(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void RightAngleMirror(int n){
        for (int i=0;i<n;i++) {
            //for space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //for space
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
