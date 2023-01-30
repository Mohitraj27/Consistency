class Solution {
    public void rotate(int[][] matrix) {
        //First we will take the transpose and then do the reverse 
        
        /*
00   01   02                                00  10  20                            20  10  00
10   11   12  >> First take the transpose>> 01  11  21  >> Now reversing first >> 21  11  21
20   21   22                                02  12  22      column with third     22  12  02
                                                         
       */
        
        
        int n=matrix.length;
        
        //taking the transpose of a matrix by swapping elements 
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                //swap matrix[i][j] with matrix[j][i]
                int temp= matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        
        //now taking the reverse of 1st column and third column
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            { //swap matrix[i][j] with matrix[i][n-j-1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        
        
        
        
    }
}