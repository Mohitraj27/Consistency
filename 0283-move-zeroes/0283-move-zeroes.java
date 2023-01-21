class Solution {
    public void moveZeroes(int[] nums) {
        
        
        //Using Two pointer approach
        
        int j=0;
        //Iterating the jth pointer through each elements
        for(int i=0;i<nums.length;i++)

        {
            
            if(nums[i]!=0)
            {
                
                nums[j++]=nums[i];
            }
        
        }
        
        while(j<nums.length)
            nums[j++]=0;
        
        }
}
