package PACKAGE_NAME.codeforces;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int b1 = sc.nextInt();
            int b2 = sc.nextInt();

            int suneetWins = 0;

            if (winsGame(a1, a2, b1, b2)) suneetWins++;
            if (winsGame(a1, a2, b2, b1)) suneetWins++;
            if (winsGame(a2, a1, b1, b2)) suneetWins++;
            if (winsGame(a2, a1, b2, b1)) suneetWins++;

            System.out.println(suneetWins);
        }

        sc.close();
    }

    public static boolean winsGame(int s1, int s2, int l1, int l2) {
        int suneet = 0;
        int slavic = 0;

        if (s1 > l1) suneet++;
        else if (s1 < l1) slavic++;

        if (s2 > l2) suneet++;
        else if (s2 < l2) slavic++;

        return suneet > slavic;
    }
}
