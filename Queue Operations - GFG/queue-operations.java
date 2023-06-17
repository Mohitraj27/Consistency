//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

// Helper class Geeks to implement 
// insert() and findFrequency()
class Geeks{
    
    // In this problem we have to check the number of frequency of element 
    // which are present in the Queue
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        
        // Your code here
        q.add(k);
    }
    // time - O(N*M)
    // space - O(N)
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
        Queue<Integer> c_q=new LinkedList<>();
        
        
        // Your code here
        int ans=0;
        // we'll pop all the elements from the queue if current element matches with 
        // element of q then incresase the ptr by 1 which at last gives the freq of that
        // element if  curr elem not equal to k then add that to queue
        while(!q.isEmpty()){
            int curr=q.poll();
            c_q.add(curr);
            if(curr==k)
            ans++;
        }
        // so after 1st iteration queue becomes empty so we again reintialize them with 
        // queue and ans ptr is returned
        while(!c_q.isEmpty())
            q.add(c_q.poll());
            return ans;
        }
    }
    


//{ Driver Code Starts.

// Driver class with driver code
class GFG {
    
    // Driver code
	public static void main (String[] args) {
		
		// Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    // Declaring Queue
		    Queue<Integer> q = new LinkedList<>();
		    int n = sc.nextInt();
		    
		    // Invoking object of Geeks class
		    Geeks obj = new Geeks();
		    
		    for(int i = 0;i<n;i++){
		        int k = sc.nextInt();
		        obj.insert(q, k);
		    }
		   
		    int x = sc.nextInt();
		    for(int i = 0;i<x;i++){
		        int k = sc.nextInt();
		        int f = obj.findFrequency(q, k);
		        if(f != 0){
		            System.out.println(f);
		        }
		        else{
		            System.out.println("-1");
		        }
		    }
		}
	}
}
// } Driver Code Ends