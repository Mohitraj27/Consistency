class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int sti=0,endi=n*m-1;
        while(sti<=endi){
            int mid = sti+(endi-sti)/2;
            int mididx= matrix[mid/m][mid%m];
            if(mididx==target){
                return true;
            }else if(mididx<target){
               sti= mid+1;
            }else{
              endi=  mid-1;
            }

        }
        return false;

    }
}