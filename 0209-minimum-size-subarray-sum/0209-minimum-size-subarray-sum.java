class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length,left=0,ans=n+1,window=0;
        for(int right = 0; right < n; right++){
            window +=nums[right];
            while(window>=target){
                ans = Math.min(ans,right-left+1);
                window-=nums[left++];
            }
        }
        return ans==n+1?0:ans;
    }
}