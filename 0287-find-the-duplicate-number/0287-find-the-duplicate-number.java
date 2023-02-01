class Solution {
    public int findDuplicate(int[] nums) {
        
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            //Iterating through each element to know the duplication of elements
            if(nums[i]==nums[i+1])
                //if found return that particular element else zero
                return nums[i];
        }
        return 0;
        
    }
}