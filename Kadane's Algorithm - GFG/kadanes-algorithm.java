//{ Driver Code Starts
import java.io.*;

import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        /*
        Algorithm Used
        1. Intialzing current  sum and max_sum to intial element
        2. iterating through each element 
        3. finding the max b/w current element annd the sum of current element,current_sum
        4. taking this max_sum and current_sum and finding the max b/w them
        5. returning the max_sum after iterating through all the elements
        
        */
        long current_sum=arr[0];
        long max_sum=arr[0];
        for(int i=1;i<n;i++)
        {
            current_sum=Math.max(current_sum+arr[i],arr[i]);
            max_sum=Math.max(max_sum,current_sum);
        }
        return max_sum;
        
    }
    
}

