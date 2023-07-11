//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
	public static int kthSmallest(int[][]matrix,int n,int k)
	{
        //code here.
        // int rows = matrix.length;
        // int cols = matrix[0].length;

        // Flatten the matrix into a 1D array
        int[] flattened = new int[n * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flattened[index++] = matrix[i][j];
            }
        }

        // Sort the flattened array
        Arrays.sort(flattened);

        // Return the kth smallest element
        return flattened[k - 1];

    }
}