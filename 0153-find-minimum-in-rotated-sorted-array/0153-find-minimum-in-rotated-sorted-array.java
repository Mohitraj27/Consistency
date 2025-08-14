class Solution {
    public int findMin(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]<nums[i]);
            // return nums[i];
            min=Math.min(min,nums[i]);
        }
        return min;
    
    }
}