package PACKAGE_NAME.codechef;

import java.util.Scanner;

public class RunningComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int size = sc.nextInt();
            int[] alice = new int[size];
            int[] bob = new int[size];
            for (int i = 0; i < size; i++) {
                alice[i] = sc.nextInt();
            }
            for (int i = 0; i < size; i++) {
                bob[i] = sc.nextInt();
            }
            happy(alice, bob);
        }
    }

    public static void happy(int[] arr, int[] brr) {
        /* package codechef; // don't place package name! */


        /* Name of the class has to be "Main" only if the class is public. */
        class Codechef {
            public static void main(String[] args) throws java.lang.Exception {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while (n-- > 0) {
                    int size = sc.nextInt();
                    int[] alice = new int[size];
                    int[] bob = new int[size];
                    for (int i = 0; i < size; i++) {
                        alice[i] = sc.nextInt();
                    }
                    for (int i = 0; i < size; i++) {
                        bob[i] = sc.nextInt();
                    }
                    happy(alice, bob);
                }
            }

            public static int happy(int[] arr, int[] brr) {
                int happy = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > brr[i] && arr[i] <= 2 * brr[i]) {
                        happy++;
                    } else if (arr[i] < brr[i] && arr[i] >= 2 * brr[i]) {
                        happy++;
                    }
                }
                return happy;
            }
        }
    }
}




