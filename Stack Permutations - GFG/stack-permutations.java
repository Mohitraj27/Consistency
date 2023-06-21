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
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            
            int[] B = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.isStackPermutation(N, A, B);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        /*
        1. Create a stack 
        2. push all the elements of the array ip to it one by one 
        3.now check the top element of the stack from first elemnt of array op 
        eg. from [1,2,3] ... 1 pushed to stack and check for the top element of the stack , not found
        now push 2 and yes now 2 found in the top of the stack pop it out from the stack i.e pop 2 from stack
        4. now 1 will be the top of the stack again compare this with top of the stack and as found this 1 element
        will be poped out this way .. it continues return 1 if possible and 0 for not possible 
        
        */
        Stack<Integer> st=new Stack<>();
        // time - O(N) space -O(N)
        int j=0;
        for(int i=0;i<n;i++){
            st.push(ip[i]);
            if(st.peek()==op[j]){
                while(!st.isEmpty() && st.peek() == op[j]){
                    st.pop();
                    j++;
                }
            }
        }
        if(st.size()==0){
            return 1;
        }
        return 0;
        
    }
}
            
