//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] nums, int n) {
        // code here
        
     //int n=nums.length;
        //both pointer are intialized with 1
        long leftprod=1;
        long rightprod=1;
        long ans =nums[0];
        
        for(int i=0;i<n;i++)
        {
            //if any of the leftproduct or rightproduct becomes 0 then update it to 1
            leftprod = leftprod == 0 ? 1: leftprod;
            rightprod = rightprod==0 ? 1: rightprod;
            
            //keep on itertaing from leftmost element of array and storing it on 
            //leftProduct variable by taking the product
            
            //prefix product
            leftprod*=nums[i];
            
            
            //keep on itertaing from rightmost element of array i.e last element
            // and storing it on rightProduct variable by taking the product 
            //suffix product
            rightprod*=nums[n-1-i];
            
            //comparing the max among the two updated values i.e rightproduct subarray and leftproduct
            // subarray after each iteration this will keep on updating the max product subarray 
            // atlast when the iteration is completed final ans will be returned
            ans=Math.max(ans,Math.max(leftprod,rightprod));
            
        }
        return ans;
    }
}