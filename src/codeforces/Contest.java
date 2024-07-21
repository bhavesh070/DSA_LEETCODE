package PACKAGE_NAME.codeforces;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {

            int n = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int moves = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] != 0) {
                    moves++;
                }
            }

            if (moves % 2 == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
