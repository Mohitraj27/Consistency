//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        /*
        first we'll sort the array 
        and taje the differnce b/w intial element and last element
        intialize max and min to 0
        iterating through for loop such that if current element-k is -ve coontiue
        find the max b/w previous to current element +k and last elemnt -k 
        after that find the min b/w intial elemnt +k and cuurent +k
        then find the difference b.w max-min and store the  minimal to diff
        after iteration of for loop return the diff
        */
         Arrays.sort(arr);
        int diff=arr[n-1]-arr[0];
        int min=0;int max=0;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0)continue;

            max=Math.max(arr[i-1]+k,arr[n-1]-k);
            min=Math.min(arr[0]+k,arr[i]-k);

            diff=Math.min(diff,max-min);
        }
        return diff;

       }
    
    
        
    
}
