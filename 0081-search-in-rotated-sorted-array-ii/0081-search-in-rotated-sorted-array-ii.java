class Solution {
    public boolean search(int[] nums, int target) {
        
        
        //Same approach as that of Search in Sorted array using linear seach technique 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return true;
            }
        }
        return false;
        
        
    }
}