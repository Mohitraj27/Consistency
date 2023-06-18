//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int ans[] = ob.sumClosest(arr, x);
            System.out.print(ans[0]+" "+ans[1]);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int[] sumClosest(int[] arr, int x) {
      int []ans=new int[2];
      
     int N=arr.length;
     //using two pointer approach
     int l=0,r=arr.length-1;
     int diff=Integer.MAX_VALUE;
     /*
     taking additional array and iterating throughout the array and 
     taking differnece between two element using Math.abs such that no -ve elements should come
     if it greater than diff which is the most minimum element and if it is greater then decrement right ptr by 1
     */
     while(r>l){
         if(Math.abs(arr[l]+arr[r]-x)<diff){
             ans[0]=arr[l];
             ans[1]=arr[r];
             diff=Math.abs(arr[l]+arr[r]-x);
             
         }
         else if(arr[l]+arr[r]>x){
             r--;
             
         }
       else{
           l++;
       }
       }
     return ans;
        // code here 
    }
}