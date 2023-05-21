//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    
//     static Stack<Integer> leftSmaller(int n, int a[]) {
//     Stack<Integer> s = new Stack<>();

//     // Traverse all array elements
//     for (int i = 0; i < n; i++) {
//         while (!s.empty() && s.peek() >= a[i]) {
//             s.pop();
//         }
//         if (s.empty()) {
//             System.out.print("-1");
//         } else {
//             System.out.print(s.peek());
//         }
//         s.push(a[i]);
//     }
//     return s;
// }

static List<Integer> leftSmaller(int n, int a[]) {
    List<Integer> result = new ArrayList<>();
    List<Integer> stack = new ArrayList<>();

    // Traverse all array elements
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && stack.get(stack.size() - 1) >= a[i]) {
            stack.remove(stack.size() - 1);
        }
        if (stack.isEmpty()) {
            result.add(-1);
        } else {
            result.add(stack.get(stack.size() - 1));
        }
        stack.add(a[i]);
    }
    return result;
}


    
}