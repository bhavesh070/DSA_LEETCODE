package PACKAGE_NAME.GFG.BitManupulation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {




    class Solution
    {
        public int[] AllPrimeFactors(int N) {
            List<Integer> list = new ArrayList<>();

            for (int i = 2; i <= N; i++) {
                if (N % i == 0) {
                    if (isPrime(i)) {
                        list.add(i); // Add the prime factor i to the list
                        // Remove all occurrences of this prime factor from N

                    }
                }
            }

            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            return result;
        }
        public boolean isPrime(int n){
            if(n == 0 || n == 1){
                return false;
            }
            for(int i=2;i<n;i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;

        }
    }
}
