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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

// we've declared this for Index of a cell
class Index{
    int row;
    int col;
    public Index(int row,int col){
        this.row=row;
        this.col=col;
    }
}
class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        /*
        1 -> Fresh Oranges
        2 -> rotten oranges
        0 -> no rotten oranges
        Approach Using Queue
        At first minute of time we identify rotten oranges and push all them in a queue
        now at second minute of time whatever fresh oranges next adjacent to rotten oranges are 
        presnt we'll rott them , and now to do so pop all the previous elements inserted in a queue
        
        Now that fresh organes gets rotten and we'r at third minute of time if we found any other fresh 
        oranges adjacent to rotten ones similar procedure will occur for these fresh oranges also
        and it will work till n times until all the fresh oranges gets rotten . as we found that no such fresh oranges
        remains loop terminates and number of time the iteration takes throughout the traversal of grid 
        wil be returned 
        time - 
        
        */
        Queue<Index> qu=new LinkedList();
        int freshcount=0;
        //we run a loop in a grid and found a rotten orange we put it index ina a queue else increment a counter
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //condition for rotten oranges
                if(grid[i][j]==2){
                    qu.add(new Index(i,j));
                    
                }
                // no rotten found at any cell increment the ptr by 1
                else if(grid[i][j]==1){
                    freshcount++;
                    
                }
            }
        }
        //represntation of direction we can move in a 2D matrix to make fresh organges as rotten
        
        int [][]direction={{1,0},{0,1},{-1,0},{0,-1}};
        // time count 
        int count=0;
        // when queue is not emoty and frshcount is presnt inside queue
        while(!qu.isEmpty() && freshcount>0){
            // we found fresh oranges so incremnt time counter by 1 
            count++;
            
            int size=qu.size();
            while(size-->0){
                Index temp=qu.poll();
                // now to move at four adjacent direction of a matrix to make fresh 
                // oragnges rotten
                
                for(int []d:direction){
                    int row=temp.row+d[0];
                    int col=temp.col+d[1];
                    //checking if it is a valid move for adjacent indices  making fresh oragnges to rotten throughout the grid
                    if(row<0||col<0||row>=grid.length||col>=grid[0].length|| grid[row][col]==0 ||grid[row][col]==2)
                    continue;
                    qu.add(new Index(row,col));
                    //now after rotten oranges putting its value to that positon
                    grid[row][col]=2;
                    // so now fresh oranges gets rotten so its value in the queue gets reduced by 1
                    freshcount--;
                    
                }
            }
            
        }
        // -1 when not possible to rotten the oranges
        return freshcount==0?count:-1;
        
        
        
        
        
        
        // Code here
    }
}