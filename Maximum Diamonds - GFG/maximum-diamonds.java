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
            
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);
            
            int[] A = new int[N];
            
            String S1[] = read.readLine().split(" ");
            for(int i=0; i<N; i++)
                A[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxDiamonds(A,N,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long maxDiamonds(int[] A, int N, int K) {
        // code here
        // // brute-force approach TLE occured
        // int max=0;
        // long sum=0;
        // int j=0;
        // //ArrayList<Integer> result=new ArrayList<Integer>(K);
        // int result[]=new int[K];
        // for(int i=0;i<K;i++){
          
        //     Arrays.sort(A);
        //     max=A[N-1];
        //     result[j]=(max);
        //     A[N-1]/=2;
        //     j++;
        //     }
            
        // for(int i=0;i<K;i++){
        //     sum+=result[i];
        // }
        // return sum;
        // optimized approach using heap i.e priority QUeue
        /*
        Optimized algorithm Used
        1. we've intiazed all the elements into heap which is priority queue in java and added .reverse to make it a max heap
        2. iterating thorugh all the elementss and after that iterating k times
        3. removing the topmost element from pq
        and adding it to ans and again taking the quotient/2 as per given condition 
        and putting at that position of the queue.
        after completing the iteration returning the queuee
        3. added all 
        */
PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
for(int x: A)
pq.add(x);
long ans=0;
for(int i=0;i<K;i++)
{
    int curr=pq.remove();
    ans+=curr;
    pq.add(curr/2);
}
return ans;
        
    }
    };
