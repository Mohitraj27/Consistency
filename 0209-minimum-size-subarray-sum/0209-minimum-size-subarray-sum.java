class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int ans=Integer.MAX_VALUE;
        
        int sum=0;
        // left index counter 
            int left=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            
            while(sum>=target){
                // i+1-left will remove the remaining  left  elements  and storing the minimum index among them 
                
                ans=Math.min(ans,i+1-left);
                sum-=nums[left];
                left++;
            }
        }
       return ans=(ans==Integer.MAX_VALUE)?0:ans;
    //     //If there is no such array then return 0
    //     if(ans==Integer.MAX_VALUE){
    //         return 0;
    //     }
    //     else{
    // return ans;}
    }
}