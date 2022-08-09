/* Leetcode Problem 867
 Problem Statement Transpose of a Matrix
 Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

*/
class Day_51 {
    public int[][] transpose(int[][] a) {
        int row= a.length;
        int col= a[0].length;
        int [][]res = new int[col][row];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[j][i]= a[i][j];
            }
        }
        
        return res;
    }
}

/*
 Sample Test Cases

 Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 */