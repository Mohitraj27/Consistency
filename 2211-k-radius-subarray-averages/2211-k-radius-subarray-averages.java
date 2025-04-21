class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int res[]=new int[n];
        // Fill Initally all the element with -1 and then place the avg subarray which matchs the kth radius at that indx
        Arrays.fill(res,-1);
        long win =0;
        int kk=k;
        int indx = 2*k+1;
        // check to handle tha window size should not be greater than length of array
        if(indx>n){
            return res;
        }
        for(int i=0;i<indx;i++){
            win+=nums[i]; // Store all the element for each window
            
        }
        res[kk]=(int)(win/indx);
        // increment the pivot by 1 after placing the avg at that index
        for(int i=indx;i<n;i++){
            win=win-nums[i-indx]+nums[i];
            res[++k]=(int) (win/indx);

        }
        return res;
    }
}