//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        // taking a new array and merging both the arrays in result
        int result[]=new int[n+m];
        for(int i=0;i<n;i++)
        {
            result[i]=a[i];
        }
    for(int j=0;j<m;j++)
        {
            result[n+j]=b[j];
        }
        // sorting the merged array
        Arrays.sort(result);
        // now if the length of the merged array is even 
        // divide the length of the array by 2 and return (intial and final value of array)/2
        if((n+m)%2==0)
        {
            int z=(n+m)/2;
            int s=result[z];
            
            int e=result[z-1];
            
            double ans=(e+s)/2.0;
            return ans;
            
        }
        //If length if array is odd then divide the length of array by 2 
        // round that value and return arr[value]
        else{
            int z=Math.round((n+m)/2);
            return result[z];
        }
    
        
    }
}