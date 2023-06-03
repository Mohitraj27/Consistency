//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class GFG
{
    // time - O(logn) and Space - O(1)
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
         ArrayList<Long> result = new ArrayList<>();
        // taking two individual methods for first and last occurence of elements 
        long first=firstOcc(arr,n,x);
        long last =lastOcc(arr,n,x);
        // adding both the first and last to the array list
         result.add(first);
        result.add(last);
        // returning the array list after adding first and last occurence of elements
        return result;
    }
    // Using the algorithm of binary search for first occurence

         long firstOcc(long arr[], int n, int x) {
    int start = 0, end = n - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] < x)
            start = mid + 1;
        else if (arr[mid] > x)
            end = mid - 1;
        else {
            if (mid == 0 || arr[mid - 1] != x)
                return mid;
            else
                end = mid - 1;
        }
    }

    return -1;
}

    
    // Similar Algorithm of binary search is used for counting last occurence
   long lastOcc(long arr[], int n, int x) {
    int start = 0, end = n - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] < x)
            start = mid + 1;
        else if (arr[mid] > x)
            end = mid - 1;
        else {
            if (mid == n - 1 || arr[mid + 1] != x)
                return mid;
            else
                start = mid + 1;
        }
    }

    return -1;
}

}



//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
//            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] q = line.trim().split("\\s+");
            int n =Integer.parseInt(q[0]);
            int x =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            GFG ob = new GFG();
            ArrayList<Long> ans=ob.find(arr,n,x);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}

// } Driver Code Ends