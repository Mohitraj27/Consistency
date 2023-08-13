//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




//User function Template for Java
class Solution {
    int median(int matrix[][], int R, int C) {
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        
        // Find the minimum and maximum values in the matrix
        for (int i = 0; i < R; i++) {
            minVal = Math.min(minVal, matrix[i][0]);
            maxVal = Math.max(maxVal, matrix[i][C - 1]);
        }
        
        int desired = (R * C + 1) / 2;
        
        while (minVal < maxVal) {
            int mid = minVal + (maxVal - minVal) / 2;
            int count = 0;
            
            for (int i = 0; i < R; i++) {
                count += upperBound(matrix[i], mid);
            }
            
            if (count < desired) {
                minVal = mid + 1;
            } else {
                maxVal = mid;
            }
        }
        
        return minVal;
    }
    
    private int upperBound(int[] row, int target) {
        int left = 0, right = row.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (row[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}
