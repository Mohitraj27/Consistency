//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.next();
            }
            
            int k = Integer.parseInt(sc.next());
            
            String str = sc.next();
            
            Solution obj = new Solution();
            int ans = obj.klengthpref(arr,n,k,str);
            System.out.println(ans);
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {// also check the corner case for k less than string length and not more than that
        if(k>str.length())
        return 0;
        
       int count=0;
        
        // first store the substring in a temp variable 
        String temp=str.substring(0,k);
    //now iterate throughout the array string and compare each string with substring 
    // now increment the count variable by 1 
    // return count
        for(int i=0;i<n;i++)
        {
            // condition for checking the length of current element less than K
            if(arr[i].length()<k) continue;
            
            if(temp.equals(arr[i].substring(0,k)))
             {
                 count++;
             }
 
            }
            return count;
    }
}