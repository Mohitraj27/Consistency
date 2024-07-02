class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length;
        int cols=grid[0].length;
        int neg=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]<0){
                    neg++;
                }
            }
        }
        return neg;
    }
}