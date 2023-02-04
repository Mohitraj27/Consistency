//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            Solution ob = new Solution();
            ob.printDiamond(n);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    void printDiamond(int n) {
        // Your code here
        
       //writing code  down half diamond
      int space = n - 1;

        // run loop (parent loop)
        // till number of rows
        for (int i = 0; i < n; i++) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++) System.out.print(" ");

            // Print i+1 stars
            for (int j = 0; j <= i; j++) System.out.print("* ");

            System.out.print("\n");
            space--;
        }

        // Repeat again in
        // reverse order
        space = 0;

        // run loop (parent loop)
        // till number of rows
        for (int i = n; i > 0; i--) {
            // loop for initially space,
            // before star printing
            for (int j = 0; j < space; j++) System.out.print(" ");

            // Print i stars
            for (int j = 0; j < i; j++) System.out.print("* ");

            System.out.print("\n");
            space++;
        }
    }
}
