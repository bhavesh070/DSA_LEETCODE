package PACKAGE_NAME.GFG.BitManupulation;

import java.util.Arrays;

public class CountPrime {

    public class CountPrimes {
        class Solution {
            public int countPrimes(int n) {
                boolean [] prime = new boolean[n+2];
                Arrays.fill(prime,true);

                prime[0] = prime[1] = false;

                for(int i=2;i*i<n;i++){
                    if(prime[i]){
                        for(int j = i*i;j<n;j+=i){
                            prime[j] = false;
                        }
                    }
                }
                int count = 0;
                for(int p = 0;p<n;p++){
                    if(prime[p]){
                        count++;
                    }
                }
                return count;
            }
        }
    }

}
