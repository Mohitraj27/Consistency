//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] s = br.readLine().trim().split(" ");
            int[][] Intervals = new int[n][2];
            int j = 0;
            for(int i = 0; i < n; i++){
                Intervals[i][0] = Integer.parseInt(s[j]);
                j++;
                Intervals[i][1] = Integer.parseInt(s[j]);
                j++;
            }
            Solution obj = new Solution();
            int[][] ans = obj.overlappedInterval(Intervals);
            for(int i = 0; i < ans.length; i++){
                for(j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// class Solution
// {
//     public int[][] overlappedInterval(int[][] Intervals)
//     {
//         // Code here // Code here
//     }
// }

class Solution {
    // 8 Jaynary 2023
    public int[][] overlappedInterval(int[][] intervals) {
        Arrays.sort(intervals, (a1,a2)-> a1[0]-a2[0]); //  time - O(NlogN)

        Stack<int[]> stack = new Stack<>(); //O(N)
        stack.push(intervals[0]);
        int i=1;
        while(!stack.isEmpty() && i < intervals.length){ // space - O(N)
            int[] current = stack.peek();
            int[] next = intervals[i++];
            if(current[1]>=next[0]){
                stack.pop();
                current[1] = Math.max(current[1], next[1]);
                stack.push(current);
            }else{
                stack.push(next);
            }
        }

        return stack.toArray(new int[stack.size()][2]);
    }
}