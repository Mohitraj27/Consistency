class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
         int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (rowSum[i] <= colSum[j]) {
                matrix[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i--;
            } else {
                matrix[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j--;
            }
        }
        
        return matrix;
    }
}