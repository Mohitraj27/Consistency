class Solution {
    public void setZeroes(int[][] matrix) {
    
        boolean firstrow=false,firstcolumn=false;
        
        
        //Marking for first rows and columns
        for(int i=0;i<matrix.length;i++)
        
            for(int j=0;j<matrix[0].length;j++)
            if(matrix[i][j]==0){
                if(i==0) 
                    firstrow=true;
                if(j==0)
                    firstcolumn=true;
                matrix[0][j]=0;
                matrix[i][0]=0;
                
            }
        
        
        
//for iterating through inner rows and columns
        
        for(int i=1;i<matrix.length;i++)
                    for(int j=1;j<matrix[0].length;j++)
                   
                           if(matrix[i][0]==0||matrix[0][j]==0)
                
                    matrix[i][j]=0;
            
            
        
        
        
        //last remaining check
        if(firstrow)
            for(int j=0;j<matrix[0].length;j++)
                matrix[0][j]=0;
        if(firstcolumn)
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        
    }
}