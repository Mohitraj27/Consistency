//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int solve(int n, int k, int[] stalls) {
        /*
        time complexity is O(n)
        n > no of stalls , k -> no of cows , stalls -> positon of stalls  
        */
        
        // 1 -> 2 -> 4 -> 8
        // sorted the array to ensure the stalls are in increasing order of position
        Arrays.sort(stalls);
        // low has minimum distance b/w any two stalls 
        int low=1; 
        // high has the maximum distance b/w any two stalls
        int high=stalls[n-1]-stalls[0];
        
        // Now Using binary search we search that has the minimum distance b/w cows
        while(low<=high){
            
            int mid=(low+high)/2;
            if(isPossible(k,stalls,mid)){
                low=mid+1;
            }        else{
                high=mid-1;
            }
            
        } 
        return high;
        
    }
    // check the possiblity where the minimum distance b/w cows
    static boolean isPossible(int k,int []arr,int mindis){
        int cnt=1;
        int prevCow=arr[0];
        // iterating through loop to check how many cows are kept
        for(int i=1;i<arr.length;i++){
            // calculating the distance b/w cows and comparing them with minimum distance
            /// if not > minimum distance then increment the counter variable and check for next 
            // element 
            if(arr[i]-prevCow>=mindis){
                prevCow=arr[i];
                cnt++;
                
            }
        }
        // to check we've placed k no of cows or not
        return cnt>=k;
    }
}