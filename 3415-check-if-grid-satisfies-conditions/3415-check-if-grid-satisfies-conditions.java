class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        int m = grid.length;        
        int n = grid[0].length;     

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // check thorughout the row
              if (i + 1 < m && grid[i][j] != grid[i + 1][j]) {
                    return false;
                }

                // Check throughout the columns
                if (j + 1 < n && grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}