//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java


class Solution{
    
    public static int countBitsFlip(int a, int b){
        //Take XOR of a and b
          int x = a^b;
          int mask=1;
        //to check each bit of x in a loop.
          int c = 0;
        //c is counter of value 1 after XOR
        while(mask<=x) {
            if((mask&x)!=0)
            c++;
            
            mask=mask<<1;
        }
       return c;
    }
   
}

//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends