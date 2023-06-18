//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    // space O(2^n + n^2). time - O(4^n)
    public static void func(int[][] m,int n,ArrayList<String>path, String s, int [][]vis,int i,int j){
       // Check if the current indices i and j are out of bounds 
       //(i.e., less than 0 or greater than or equal to n). If so, return.
        if(i<0||j<0||i>=n||j>=n)return ;
        if(m[i][j]==0||vis[i][j]==1)return;
        // check if the current cell is a barrier (O) or has been already visited.
        // if either conditon is true then return
        if(i==n-1&&j==n-1){
            path.add(s);
            return;
        }
        vis[i][j]=1;
        //if current cell is 1 bnackrack with all possiblity of left,right,upp.dowm
        // by increment the ith ,jth ptr accordingly
         func(m,n,path,s+"R",vis,i,j+1);
          func(m,n,path,s+"L",vis,i,j-1);
           func(m,n,path,s+"D",vis,i+1,j);
            func(m,n,path,s+"U",vis,i-1,j);
            //make the current cell as univisted by intializing it back to 0
              vis[i][j] = 0 ; 
    }

// task is to find & print all the possible path such that rat can reach from source to destination

    public static ArrayList<String> findPath(int[][] m, int n) {
        //taking an array list to store all the possible path
        ArrayList<String>path=new ArrayList<String>();
        //a 2D matrix to mark the visisted cells (elemenrts)
        int vis[][] = new int[n][n];
        //intialzing matrix cells with 0
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        //Check if the starting cell m[0][0] or the ending 
        //cell m[n-1][n-1] is a barrier (0). If either condition 
        //is true, return the empty path list.
         if(m[0][0]==0){
            return path ; 
        } 
        if(m[n-1][n-1]==0){
            return path ; 
        }
        // Create an empty string s.

//Call the func function with the initial parameters: 
//m, n, path, s, vis, 0, and 0.
        String s="";
        // create a helper function and pass these parameters to them
        func(m,n,path,s,vis,0,0);
        //after backtracing all the posibilty and storing all the path in array list return
        return path;
    }
}

 

 

 