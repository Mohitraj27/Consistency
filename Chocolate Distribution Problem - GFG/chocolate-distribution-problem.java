//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        //Using the concept of sliding window
        //cause we need the minimum gap
        
        int ans=Integer.MAX_VALUE;
        // your code here
        //Sorted using java collection framework cause Arrays.sort won't work for arraylist
        Collections.sort(a);
        //Iterating through each element of array
        for(int i=0;i<=n-m;i++)
        { //Intializing minimum window to first element
            int minwindow=a.get(i);
            //taking last element for a sliding window
            int maxwindow=a.get(i+m-1);
            // for that selected window caluclating the gap
            int gap=maxwindow-minwindow;
        //conditon for comparing the gap with ans 
        // in ans variable max integer value is stored so that it should get comapred 
        // after each iteration and after if gap is minimum then the previous window if condition 
        // statisfies and ans will stored with that minimum gap value /
        
        // then ans will be 
        if(gap<ans)
        {
            ans =gap;
        }
        
        
        }
        // after final iteration is completed ans is returned
        
        return ans;
    }
}






