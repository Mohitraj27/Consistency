//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int nums[], int n)
    {
        /* Space - O(n) Time -O(n)
        Algorithm used 
        taking from last houses such that 
        if Total loot if  robbed (n-2)=total loot(n-2)+loot(n);
        total loot if robbed (n-1)=totalloot(n-1)
        
        //below is the main condition for houses more than 2 will iterate using for loop
 Totalloot at house(n)= Math.max((total loot(n-2)th positon + total loot at current position i.e n),total_loot(n-1));
        */
        //Condition when there are less than 2 houses return the array as it is
        if(n<2)
        return nums[0];
        
        //taking an extra array with size n
        int dp[]=new int[n];
        
        //Initilzing the first and second element for two houses
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        
        //now iterating from 2 houses 
        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        
        return dp[n-1];
        
        // Your code here
    }
}