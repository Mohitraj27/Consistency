//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int N) {
        // code here
   int count = 0; 
        //Initialize counter variable as 0
        while(N>0){
            //Check if each bit is set or not
            if(N%2 == 1){
                count++;
            }
            N = N/2;
            //Keep reducing the number till it becomes 0 , as we do in decimal to            binary conversion
        }
        //Return number of set bits
        return count;
        
    }
}