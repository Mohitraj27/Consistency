//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String s)
    {
         // O(n) time | O(n) space
        if(s == null || s.length() == 0)    return true;
        if(s.length() % 2 != 0) return false;
        
        Stack<Character> myStack = new Stack<>();
        
        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch == '[' || ch == '{')
                myStack.push(ch);
            else
            {
                if(ch == ')' && (myStack.isEmpty() || myStack.peek() != '('))
                    return false;
                if(ch == ']' && (myStack.isEmpty() || myStack.peek() != '['))
                    return false;
                if(ch == '}' && (myStack.isEmpty() || myStack.peek() != '{'))
                    return false;
                
                myStack.pop();
            }
        }
        return myStack.isEmpty();
        // add your code here
    }
}
