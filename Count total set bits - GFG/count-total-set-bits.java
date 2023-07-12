//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java


class Solution {
    // Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n) {
        if (n == 0) {
            return 0;
        }

        int x = largestPowerOf2InRange(n);
        //for values below range2^x
        int btill2x = x * (1 << (x - 1));//X*2^X-1
        // 1st bit from remaining
        int msb2xton = n - (1 << x) + 1;//N - 2^X+1
        // left bits of remaning
        int rest = n - (1 << x);//N-2^X
        //sum of all bits.
        int ans = btill2x + msb2xton + countSetBits(rest);
        return ans;
    }
    
//to find largest power of 2 in that range

      public static int largestPowerOf2InRange(int n) {
        int x = 0;
//1<< x = 2 to the power x
        while ((1 << x) <= n) {
            //  11, X=4  
            x++;
        }
// eg for n=10 ,2^4 is <=n , so the largest value of x in range is x-1 i.e 3
        return x - 1;
    }
}


//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends