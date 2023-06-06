//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        /*
        Hashmap is used for Integer data type
        count is initalized with 0 
        hashmap with integer data type
        
        */
        int count=0;
        HashMap<Integer, Integer> map=new HashMap<>(); 
        //count is initalized with 0 
        int i=-1;
        int sum=0;
        // intially put 0 at ith index of hash map i.e 1
        // map.put(element,index_position)
        map.put(0,1);
        //checck if for ith itertaion 
        while(i<arr.length -1){
            i++;
            // add the current element to sum
            sum+=arr[i];
            // now check that current element is present inside the hashmap or not
            // if not then in else condition add sum at ith position of hashmap
            if(map.containsKey(sum)){
                //if present then increment counter by 1 and add sum by 1
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        // after iteration throughout the hashmap is completed using index position
        // return counter variable when loop terminates 
            return count;
        
    }
}