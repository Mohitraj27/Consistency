class Solution {
    public int[] runningSum(int[] nums) {
        
        int arr=0;
        for(int i=0;i<nums.length;i++)
        //Iterating through each elements and adding it to arr array
        {       arr+=nums[i];
         nums[i]=arr;
    }
        return nums;
        
    }
}