class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans = Integer.MAX_VALUE;
        for(int start=0;start <= n-1; start++){
            int sum =0;
            for(int j=1; j<=r  && (start + j - 1) < n; j++ ){
                sum += nums.get(start + j - 1);
                if(j >= l  && sum > 0 ){
                    ans=Math.min(ans,sum);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}