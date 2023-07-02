//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends

class Solution {

    int maxIndexDiff(int arr[], int n) {
        // this left Min will store all the minimum elements on the left index of the array arr
        int[] leftMin = new int[n];
        // similary right max store all the max elements on right index of the array arr
        int[] rightMax = new int[n];
 
 
          // now intially store the first element to the array
        leftMin[0] = arr[0];
        // and comparing with that starting element of the arrau and 
        // calculating the min elements and storing them to leftMin array
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }

      // same approach is done for rightMax where we'll calculate the max element of the array
      // and store it in the right max array just we'r iterating for loop in decrement order
      
      // intially storing the last elemnt and iterating the for loop from n-2 to o
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        
        int maxDiff = 0;
        int i = 0, j = 0;
        // using two ptrs approach compare the given constraint in problem statement i.e arr[i] <= arr[j].
        // and iterating while loop accordinly for both left and right ptrs and storing the maxindexDiff in a variable 
        // and return it 
        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}
