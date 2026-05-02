class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int low=0,high=n*m-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int mididx= matrix[mid/m][mid%m];
            if(mididx==target){
                return true;
            }else if(mididx<target){
               low= mid+1;
            }else{
              high=  mid-1;
            }

        }
        return false;

    }
}