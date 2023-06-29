//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isHappy(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution { 
  
     static int isHappy(int N) { 
         //code here
         // same code as next happy number
         if(N==1 || N==7)
             return 1;
             int sum=N,curr=N;
             //make the sum of square of digits equals a single digit num
             while(sum>9){
                 sum=0;//reset sum for every itreation
                 
                 //this loop finds the sum of squares of digits
                 while(curr>0){
                     int d=curr%10;
                     sum+=d*d;
                     curr/=10;
                 }
                 
                 if(sum==1)
                   return 1;
                 //whenever new number comes it gets updated to curr
                 curr=sum;
             }
             if(sum==7)
                return 1;
             return 0;
     }
}