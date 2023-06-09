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
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 
    // static long minTime(int[] arr,int n,int k){
    //     //code here
    // }

    /*
    This question is same as that of book allocation problem so applied that code only just 
    changes the data type variables etc etc
    Problem statement Conditions
    1. Same Book two students can't read
    2. One book must be given to each student
    3. Book allocation must be in continous manner.
    
    
    */
    
    // Time - O(logn) Space O(1)

   class Solution{
    static long minTime(int[] arr,int n,int k){
        if(n<=1){
return arr[0];
}
        long sum=0;
        for(int i=0;i<n;i++)
         sum+=arr[i];
        long end=sum;
        long start=0;
        long ans=-1;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(isPossibleSolution(arr,n,k,mid)){
               ans=mid;
               end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    private static boolean isPossibleSolution(int[] arr,int n,int k,long mid){
        
        int count=1;
        long sum=0;
        for(int i=0;i<n;i++){
            
            if(sum+arr[i] <= mid){
                sum+=arr[i];
            }
            else{
                count++;
                if(count>k || arr[i]>mid) //arr[i]>mid condition says that you can't ignore a index i.e. contiguious
                 return false;
                sum=0;
                sum+=arr[i];
            }
        }
        
        return true;
    }
}  

