//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.isFrequencyUnique(n, arr);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        { // to check the unique occurences using the key of the hashmap 
        // if unique  if the key i is present in the map. If it is, 
        //the associated value is incremented by 1 and updated in the map
        //. If the key is not present, a new entry is added to the map with
        // the key i and the value 1
        int num=arr[i];
            map.put(num,map.getOrDefault(num,0)+1);
            }
        //Create a hashset to stor the unique frequences
        // cause hashset doesn't  store the duplicates indexes
        Set<Integer> result=new HashSet<>(map.values());
        
        // if the size of set matches the no of unique frequencies
        // return true
        
        return result.size()==map.size();
        
        
    }
}
        
