class Solution {
    public int search(int[] nums, int target) {
        
        //using basic linear search technique
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {       return i;
        }   
       
    } 
            return -1;
}}