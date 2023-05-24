//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            int A[] = new int[N];
            String S[] = read.readLine().split(" ");
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.productOfPairs(N, A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int productOfPairs(int N, int A[]) {
        int array_sum = 0;
        int array_individual_square_sum = 0;
        long sum = 0;
        long mod = 1000000007; 
        
        for(int i = 0; i < N; i++) {
            array_sum += A[i];
            array_sum %= mod; 
            array_individual_square_sum += ((long)A[i] * A[i]) % mod;
            array_individual_square_sum %= mod; 
        }
        
        sum = (((long)array_sum * array_sum) % mod - array_individual_square_sum + mod) % mod;
        sum = (sum * ((mod + 1) / 2)) % mod; 
        
        return (int)sum;
    }
}

