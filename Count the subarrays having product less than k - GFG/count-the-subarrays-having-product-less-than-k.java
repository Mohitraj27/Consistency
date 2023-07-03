//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            
            long a[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public int countSubArrayProductLessThanK(long arr[], int n, long k) {
        long current_product = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            current_product *= arr[right];

            while (current_product >= k && left <= right) {
                current_product /= arr[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
