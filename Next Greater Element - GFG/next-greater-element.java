//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        ot.print(res[i] + " ");
		    ot.println();
		}
        ot.close();
	}
}



// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        
        /*
        Algorithm Using Stack
        1. First An Array of Long data type is intialized with size n
        2. Now Stack of long data type is intialized 
        3. for loop is iterated from n-1 to 0 i.e in decrement order
        here traversing will begin from right most part of element 
         while in case of nearest greater to left traversing of element is from
         left to right so the loop will iterate from 0 to n-1
         
        4. the array is intialized with -1 for the first element cause no  nearest greater 
        element will be there for 1st element is there so replace with -1
        
        5. while loop ( is stack is empty)
          .peek() used to look at the object at the top of this stack without removing it from the stack.
          take this inside top variable i.e top element of stack
        6.  if(the top most element of stack is > current element )
          push the topmost element of stack inside the stack
        7. else pop the topmost element from stack
        
        8. also push the current element of stack
        9. return the final nearest greater to right array 
        
        */
        // This approach is using Stack
        long NGR[]=new long[n];
        Stack<Long> s=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            NGR[i]=-1;
            while(!s.empty())
            {
            long top=s.peek();
            
            if(top>arr[i])
           {
               NGR[i]=top;
            break;
               
           }
            else{
                s.pop();
            }
                
            }
            s.push(arr[i]);
        }
        return NGR;
        }
     
}