//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            long ans = new Solution().countSubarray(arr, n, k);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    long countSubarray(int arr[], int n, int k) {

    
    
        // code here
    // long count=0;
    //  long current_sum=arr[0];
    //     long max_sum=arr[0];
    //     for(int i=1;i<n;i++)
    //     {
    //         current_sum=Math.max(current_sum+arr[i],arr[i]);
    //         max_sum=Math.max(max_sum,current_sum);
            
    //         if(max_sum>k)
    //         {
    //              // Increment the count by the number of subarrays ending at index i
    //         count += (i + 1);
    //         }
    //     }
    //     return count;
    
    long  ans = 0;
	    int num = 0;
	    for (int i = 0 ; i < n ; i++){
	        if (arr[i] > k){
	            num = i + 1;
	        }
	        ans += num;
	    }
	    return ans;

    
}
    
}