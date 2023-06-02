//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    /* space
   1. Initialize a HashMap (map) to store the count of each character in the input string and
   a Queue (q) to store the non-repeating characters.
2.    Convert the input string A into a character array (stream).
 3.  Initialize a StringBuilder (result) to store the final result.
4. Iterate through each character c in stream:
   Increment the count of character c in map using map.put(c, map.getOrDefault(c, 0) + 1).
  If the count of character c in map is 1, add c to the end of the queue q using q.add(c).
   While the queue q is not empty:
  Get the first non-repeating character from the front of the queue without removing it using char firstNonRepeating = q.peek().
   If the count of firstNonRepeating in map is 1, it is the first non-repeating character, so break out of the loop.
 Otherwise, remove the first character from the queue q using q.remove() as it is no longer non-repeating.
  If the queue q is empty, there are no non-repeating characters encountered so far, so append "#" to the result.
  Otherwise, append the first non-repeating character from the queue q to the result.
5. Return the trimmed string representation of the result.
    */
     public String FirstNonRepeating(String A)
    {
            
        Map<Character,Integer> map=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        
// Converting String to form of chracaters to check form of non-repeating characters

        char[] stream = A.toCharArray();
// Created a string builder class to store the result instead of 
        StringBuilder result = new StringBuilder();

        //Iterating thrrough each stream of character of a given string using for each loop
        for (char c : stream) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) == 1) {
                q.add(c);
            }
            
            while (!q.isEmpty()) {
                char firstNonRepeating = q.peek();
                if (map.get(firstNonRepeating) == 1) {
                    break;
                } else {
                    q.remove();
                }
            }

            if (q.isEmpty()) {
                result.append("#");
            } else {
                result.append(q.peek()).append("");
            }
        }

        return result.toString().trim();
    }

    
}