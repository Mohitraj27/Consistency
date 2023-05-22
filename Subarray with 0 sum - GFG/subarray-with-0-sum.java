//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution().findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
}
// } Driver Code Ends


class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        // test case passed 121/431
        // List<Integer> result=new ArrayList<>();
        // int sum=0;
        
        // for(int i=0;i<n;i++)
        // {
         
        //  sum+=arr[i];
        //  if(result.contains(sum))
        //  return true;
        
        //     if(sum==0)
        //     return true;
        //     result.add(sum);
        // }
        // return false;
        
        // using HashSet
        Set<Integer> result=new HashSet<>();
        int sum=0;
        
        for(int i=0;i<n;i++)
        {
         
         sum+=arr[i];
         if(result.contains(sum))
         return true;
        
            if(sum==0)
            return true;
            result.add(sum);
        }
        return false;
    }
}