//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int nums1[], int nums2[], int n, int m, int k) {
        
        
        int i=0,j=0,kth=0;
        // iterating through both the arrays
        while(i<n && j<m){
            // comparing the intiaal elements of both the arrays whichever is smaller iterate accordingly
            // further increment the pointer of that array which is smaller and comparing the next value of that array
            // with the previous value of the array which was greater eariler
            //two sepreate conditions are wriiten for both the arrays
            if(nums1[i]<nums2[j]){
                kth++;
                if(kth==k){
                    return nums1[i];
                }
                i++;
            }
            else{
                kth++;
                if(kth==k){
                    return nums2[j];
                }
                j++; 
            }
        }
        // case when either of array gets completed iteration 
        // and some elements of  next array remains incompleted
        while(i<n)
        {
             kth++;
                if(kth==k){
                    return nums1[i];
                }
                i++;
        }
        while(j<m)
        {
             kth++;
                if(kth==k){
                    return nums2[j];
                }
                j++;
        }
        //corner edge case 
        return -1;
    }
}