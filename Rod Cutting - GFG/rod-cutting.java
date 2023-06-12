//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

            Solution ob = new Solution();
            out.println(ob.cutRod(arr, n));
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        
        /*
        returns the best obtainable price for a rod of length n and price[] as
as prices of different prices
        */
            //dp based top bottom approach solution
        //works on the concept of usual dp take & notTake algorithm
        var index = 0; var rodLen = price.length; var dp = new int[n][n+1];
        for(var i =0; i<dp.length; i++)
            for(var j =0; j<dp[0].length; j++) dp[i][j] = -1;
            
        return helper(index, rodLen, price,n, dp);
    }
    public static int helper(int index, int rodLen, int [] price, int n, int [][] dp){
        //base conditions
        if(rodLen ==0 || index==n) return 0;
        if(dp[index][rodLen]!=-1) return dp[index][rodLen];
        var notTake = helper(index+1, rodLen, price, n, dp);
        var take = 0;
        //****** imp condition to be used always else the code breaks here *********
        //eg = rodLen = 5 & index = 5 at some recursive call, then new rodLen = 5-(5+1) = -1, 
        //which is invalid rodLen so we discard such values which dont give us a appropriate rodLen
        if(rodLen>=(index+1)) take = price[index] + helper(index, rodLen-(index+1), price, n, dp);
        dp[index][rodLen] = Math.max(notTake, take);
        return dp[index][rodLen];
        
    }
}