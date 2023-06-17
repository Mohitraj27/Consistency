//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution {
    // aditya verma solution
    public int celebrity(int[][] m, int n) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        while (s.size() >= 2) {
            int i = s.pop();
            int j = s.pop();

            // if i knows j then j may be the celebrity
            if (m[i][j] == 1) {
                s.push(j);
            } else {
                s.push(i);
            }
        }

        int possible = s.pop();
        for (int i = 0; i < n; i++) {
            if (i != possible) {
                if (m[possible][i] == 1 || m[i][possible] == 0) {
                    return -1;
                }
            }
        }
        return possible;
    }
}
