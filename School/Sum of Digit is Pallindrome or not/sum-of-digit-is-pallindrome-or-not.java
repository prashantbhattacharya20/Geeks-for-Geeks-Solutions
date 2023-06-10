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
            Solution ob = new Solution();
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum = 0;
        int temp = 0;
        int reverse = 0;
        
        while (N != 0) {
            int digit = N % 10;
            sum += digit;
            N /= 10;
        }
        
        temp = sum;
        reverse = reverseDigits(sum);
        
        if (temp == reverse)
            return 1;
        else
            return 0;
    }
    
    
    int reverseDigits(int num) {
        int reversed = 0;
        
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return reversed;
    }
}