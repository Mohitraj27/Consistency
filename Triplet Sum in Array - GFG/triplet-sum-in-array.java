//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int X = Integer.parseInt(inputLine[1]);
		    int A[] = new int[n];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        A[i] = Integer.parseInt(inputLine[i]);
		    }
		    Solution ob=new Solution();
		    boolean ans = ob.find3Numbers(A, n, X);
		    System.out.println(ans?1:0);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    Arrays.sort(A);
       // Your code Here
       // The loop will iterate till n - 2 
       // cause we need at least three elements for a triplet.
       for(int i=0;i<n-2;i++)
       {
            // Two pointers: one at element after A[i] and another at the end
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = A[i] + A[left] + A[right];
                if (sum == X) {
                    return true; // Triplet found
                } else if (sum < X) {
                    left++; // Increment left pointer if sum is smaller than X
                } else {
                    right--; // Decrement right pointer if sum is greater than X
                }
            }
        }
    return false;

}}
