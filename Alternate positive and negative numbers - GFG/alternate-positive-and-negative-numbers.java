//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here   
       
      /*
      Brute force count +ve and -ve and placing odd elements in -ve indexes
      whereas even elements in +ve elements
      
      optimal approach
      relative ordering - create two separate arraylist list 1 and list2
      add -ve integers in list 1 and +ve intgers in list 2 
      now first pull elements of list1 and then pull elements from list2 alternatively
      
      list1>> +ve elements
      list2>> -ve elements
      
      */
      
      
      List<Integer> list1=new ArrayList<>();
      
      List<Integer> list2=new ArrayList<>();
      // adding all the elements in two seperate list
      for(int i=0;i<n;i++)
      {
          if(arr[i]>=0)
          {
              list1.add(arr[i]);
          }
          else{
              list2.add(arr[i]);
          }
      }
      
     //Now rearrangement of +ve and -ve elements 
     // two different pointers for arrangement at two different lists
      int pos=0;
      int neg=0;
      int index=0;
      
      while(pos<list1.size() && neg<list2.size()){
          arr[index++]=list1.get(pos++);
          arr[index++]=list2.get(neg++);
          
      }
      // in case if the array elements contains only postive elements
      
      while(pos<list1.size()){
          arr[index++]=list1.get(pos++);
          
      }
      // in case if the array elements contains only negative elements
      while(neg<list2.size()){
          arr[index++]=list2.get(neg++);
          
      }
       
               }
    
}