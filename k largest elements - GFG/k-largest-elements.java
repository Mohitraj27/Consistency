//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    int[] kLargest(int[] arr, int n, int k) {
     
     //Brute-force approach
     /* Brute force algo
     1. first we'll sort the elements of the array
     2. take an extra array with k for storing the largest elements
     3. now using two ptrs. low is intislzied with 0 value & high with last index value
     4. Iterating through elements of array using while loop such that intial value should be less
     than K
     5. last k elements will be stored in resulting array and when the size of array reaches n
     while loop will terminate and resulting array will be returned.
     
     time - O(N) space - O(N)
     */
     Arrays.sort(arr);
     int []res=new int[k];
     //two ptr approach
     int low=0,high=n-1;
     while(low<k){
         res[low]=arr[high];
         low++;
         high--;
     }
     return res;
     
     
        // code here
    }
}