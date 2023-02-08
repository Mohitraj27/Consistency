class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        //first we've created a 2D array for storing the elements 
        int result[][]=new int[m][n];
        //now for the third case if the element is 1x1D array then empty set if 2D array 
        //will be returned
        if(original.length!=m*n)
            return new int[0][0];
        for(int i=0;i<original.length;i++)
        {
            //here nr is the number of row position and nc is column position where the 
            // 1D elements will be filled so we can get the position of 2d array and 
            //using for loop we'll iterate through each element of original array
        //  insert into 2D array
            int nr=i/n;
            int nc=i%n;
            result[nr][nc]=original[i];
            
            
        } 
        return result;
    }
}