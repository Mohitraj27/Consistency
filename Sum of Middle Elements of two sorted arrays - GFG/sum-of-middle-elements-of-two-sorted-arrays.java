//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

  public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] ar1 = new int[n], ar2 = new int[n];
            String[] inputLine = br.readLine().split(" ");

            for (int i = 0; i < n; i++) {
                ar1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                ar2[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().findMidSum(ar1, ar2, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
 class Solution{
public static int findMidSum(int[] a, int[] b, int n) {
    // Taking a new array and merging both arrays in 'result'
    int result[] = new int[2 * n];
    for (int i = 0; i < n; i++) {
        result[i] = a[i];
        result[i + n] = b[i];
    }

    // Sorting the merged array
    Arrays.sort(result);

    // Calculating the mid-sum
        int mid = (2 * n) / 2;
        int sum = result[mid] + result[mid - 1];

        return sum;
}}
