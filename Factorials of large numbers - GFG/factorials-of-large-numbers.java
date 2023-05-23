//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer>  factorial(int N){
        // //code here
        // BigInteger fact=new BigInteger.ONE;
        // for(int i=2;i<=N;i++)
        // {
        //     fact=fact.multiply(BigInteger.valueOf(i));
        // }
        // return fact;
        //BigInteger factorial = factorial(N);
        
        
         //code here
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        
        for(int i=2;i<=N;i++)
        {
            int carry=0;
            
            for(int j=0;j<list.size();j++)
            {
                int val=list.get(j)*i+carry;
                list.set(j,val%10);
                carry=val/10;
            }
            
            while(carry!=0)
            {
                list.add(carry%10);
                carry=carry/10;
            }
        }
        
       Collections.reverse(list);
        
        return list;
        
    }
    // public static BigInteger factorial(int N) {
    //     BigInteger fact = BigInteger.ONE;

    //     for (int i = 2; i <= N; i++) {
    //         fact = fact.multiply(BigInteger.valueOf(i));
    //     }

    //     return fact;
    // }
    

}