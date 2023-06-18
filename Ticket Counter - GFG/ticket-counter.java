//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            Solution ob=new Solution();
            out.println(ob.distributeTicket(n,k));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int distributeTicket(int N,int k)
    {
        //brute force approach time- O(N)
        /*
        using two ptr approach 
        take two ptrs i and j 
        intialize i to starting index and j to last index , ans to 0
        take boolean a to ensure that  ticket distributed to first k people when a is false 
        and as it becomes true ticket distrbution will takes place for k people from last index
        
        this way while loop works till i<=j i.e iteration gets completed
        
        */
        int i=1,j=N,ans=0;
        boolean a= false;
        while(i<=j){
            if(a==false){
                i+=k;
                ans=j;
            }
            else{
                j-=k;
                ans=i;
            }
            a=!a;
        }
        return ans;
    }
}