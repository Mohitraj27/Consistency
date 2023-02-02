class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
       // int m=matrix.length;
//         int n=matrix.length;
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                //Interating through each elements 
                if(matrix[i][j]==target)
                {  return true;
            }}
            
        }
        
        return false;
        
    }
}