//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends




// class Solution
// {
//     //Function to return a list of integers denoting spiral traversal of matrix.
//     static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
//     {
//         // code here 
//     }
// }

class Solution {
    public  ArrayList<Integer> spirallyTraverse(int[][] matrix,int r, int c) {
        
        //taking an arraylist to store all the traversal elements
        ArrayList<Integer> ans = new ArrayList<Integer>();
        // using four pointers and iterating throughout the matrix
        
        /*
        l-> start column    u-> start row
        r -> end column     d-> end row
        */
        
        // int l = 0, r = matrix.get(0).size() - 1, u = 0, d = matrix.size() - 1;
         int l = 0, u = 0, d = r - 1, right = c - 1;
        
        // condtion for traversal of elements throughout the range of row and column
        while (l <= right && u <= d) {
            for (int i = l; i <= right && l <= right && u <= d; i++) {
                /*
                start row is fixed and column is iterating in i
                and u is incremented after adding these elements in list
                */
                ans.add(matrix[u][i]);
            }
            u++;
            for (int i = u; i <= d && l <= right && u <= d; i++) {
                
                
                // start row is  and iterating in i using for loop & column is fixed
                // and end column is decremented after adding these elements in list
                
                ans.add(matrix[i][right]);
            }
            right--;
            for (int i = right; i >= l && l <= right && u <= d; i--) {
                
                // end row is fixed and end column is iterating in i
                // and end row  is decremented after adding these elements in list
                ans.add(matrix[d][i]);
            }
            d--;
            for (int i = d; i >= u && l <= right && u <= d; i--) {
                
                // end row is iterating and starting column is fixed 
                // and strating column is incremented after adding these elements in list
                ans.add(matrix[i][l]);
            }
            l++;
        }
        return ans;
    }
}



