class Solution {
    public int firstMissingPositive(int[] nums) {
           int traversal =1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==traversal)
            {
                traversal++;
            }
           
        }
        return traversal;
        
    }
}