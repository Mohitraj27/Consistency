//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[2*e];
            int[] B = new int[2*e];
            
            for(int i=0; i<2*e; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.checkMirrorTree(n,e,A,B));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int checkMirrorTree(int n, int e, int[] A, int[] B) {
        // code here
        // this map 
        HashMap<Integer,Stack<Integer>> result=new HashMap<>();
        // this for loop will iterate till its two edges for each node 
        // for Array A and every time i'll be increment for by 2 for comparsion 
        
        for(int i=0;i<2*e;i+=2){
            
            if(result.containsKey(A[i])){
                result.get(A[i]).push(A[i+1]);
            }
            else {
                Stack<Integer> st=new Stack<>();
                st.push(A[i+1]);
                result.put(A[i],st);
            }
        }
        
        // Similarly this for loop will iterate till its two edges for each node 
        // for Array B
        
        for(int j=0;j<2*e;j+=2){
            // if top most element of stack is not equal to that i+1 element means
            // no mirror possible for parent Node B[i]
                if(result.get(B[j]).peek()!=B[j+1]) 
           return 0;
           
           else{
               // so simply remove that element and again check for other elements
               result.get(B[j]).pop();
           }
            }
            return 1;
    }
};