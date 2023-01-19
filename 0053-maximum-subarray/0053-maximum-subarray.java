class Solution {
    public int maxSubArray(int[] nums) {
        //Using Kadanes's Algorithm
        int current_sum=nums[0];
        int max_sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            current_sum=Math.max(current_sum+nums[i],nums[i]);
            max_sum=Math.max(max_sum,current_sum);

        }
        return max_sum;
    }
}