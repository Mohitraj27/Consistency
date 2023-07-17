//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
    
     List<String> ans=new ArrayList<>();
     int n=(int)Math.pow(2,s.length());
     
     //No of subsequences =2^n-1
     
     for(int i=1;i<n;i++)
     {
         int x=i;
         int j=0;
         String c="";
         while(x>0){
             if((x&1)==1)
             {
                 c+=s.charAt(j);
             }
             j++;
             x>>=1;
         }
         ans.add(c);
     }
     Collections.sort(ans);
     return ans;
    }
}