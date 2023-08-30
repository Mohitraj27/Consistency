//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        /*
        Take a Hashmap and itetaye through al the elements of the array and check if it is present 
        twice or more than using the key value of that number if it exist then increment by 1 
        and now add one more for loop by checking the size of the hashmap is grater than than 
        insert that current element inside the ans variable and retrun ans
        */
     int ans=-1;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<size;i++){
         map.put(a[i],map.getOrDefault(a[i],0)+1);
     }
     
     for(int i=0;i<size;i++){
         if(map.get(a[i])>size/2){
             ans=a[i];
         }
     }
     
     return ans;
    }
}