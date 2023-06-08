//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i])) {
                return 0; 
            }
        }
        return 1; 
    }

    private static boolean isPalindrome(int num) {
        int reverse = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return originalNum == reverse;
    }
}