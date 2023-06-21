//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String s) {
        // code here
        // corner case when string is empty 
        if(s==null || s.length()<2){
            return 0;
            
        }
        // space - O(n) time - O(n)
        Stack<Integer> st=new Stack<>();
        // by iterating through the 
        // character for opening bracket just push it into the stack 
        // 
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                // for closing bracket if stack is not empty and the char is closing bracket and then pop it 
                if(!st.empty() && s.charAt(st.peek())=='('){
                    st.pop();
                }
                // otherwise push the closiing bracket
                else{
                    st.push(i);
                }
            }
        }
        // now to print the max valid string iterating through while loop and 
        // while loop iterates till stack becomes empty
        // and atlast when loop terminates comparing the max valid parenthis and returnning it 
        int max=0;
        int end=s.length(); // 9
        while(!st.empty()){
            int curr_ele=st.pop();
            max=Math.max(max,end-curr_ele-1);
            end=curr_ele;
        
        }
        return Math.max(end,max);
    }
};