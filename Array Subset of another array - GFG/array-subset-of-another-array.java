//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        // 51/209 test cases using hashset approach
        // HashSet<Long> result=new HashSet<>();
        // //adding elements to hashset
        // for(long i: a1)
        // {
        //     result.add(i);
        // }
        // //checking if the elements prsent in the a1 array or not
        //     for(long i: a2)
        //     {
        //      if(!result.contains(i)){
        //     return "No";
        //      }
                
                 
        //     }
        //  return "Yes";
        int i=0;
    int j=0;
    
    while(j < m && i < n){
        
        if(a2[j] == a1[i]){
            a1[i] = 0;
            j++;
            i=0;
        }
        else{
            i++;
        }
    }
    
    if(j == m && i == 0){
        return "Yes";
    }
    else{
        return "No";
    }
        }
}