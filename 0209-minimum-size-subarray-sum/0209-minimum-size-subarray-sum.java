class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int ans=Integer.MAX_VALUE;
        
        int sum=0;
        
            int left=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            while(sum>=target){
                ans=Math.min(ans,i+1-left);
                sum-=nums[left];
                left++;
            }
        }
        //If there is no such array then return 0
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        else{
    return ans;}
    }
}