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
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        /*
        Bitwise XOR operator 
        0^0=0
        1^1=1
        0^1=1 
        
        These way we keep on taking the XOR of each numbers int the array
        int xor=13^10^13^26^14^20^14^20
        
        13     0   1   1   0   1
        
        10     0   1   0   1   0
        
        13     0   1   1   0   1
       
        26     1    1   0   0   0
        
        14     0    1   1   1   0
        
        20     1    0   0   1   0
        
        14     0    1    1   1   0
        
        20    1     0    0    1  0
        
  final XOR=  1    0    0   1  0  ->> 10^26 =20 means 20 has same bit common
    
    Time - O(N)+O(N)    
    Space - O(1)
           */
    
    int xor=0;
    for(int val:nums)
    {
        
        xor=xor^val;
    }
    
    int rmsbm=xor & -xor;
    // take element of xor which has element on and that which has off
    int a=0;
    int b=0;
    
    
    for(int val: nums){
        if((val & rmsbm)==0)
    {
        a=a^val;
    }
    else {
        b=b^val;
    } }
    if(a<b){
        return new int[]{a,b};
    }
    return new int[]{b,a};
    
        
        
        
    }
}