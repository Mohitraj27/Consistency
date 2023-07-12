//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        // using string builder class
      StringBuilder sb = new StringBuilder();
      // for storing each charcter form a string after removing duplicates
        HashSet<Character> set = new HashSet<>();
        // iterating thorghout each characters from a string till length of string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // if it doenn;t conatins then add that character to string 
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        
        return sb.toString();
        
    }
}

