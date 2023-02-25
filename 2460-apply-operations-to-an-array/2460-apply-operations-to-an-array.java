class Solution {
    public int[] applyOperations(int[] nums) {
    // int len=nums.length-1;
        //This checks the first operations
    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==nums[i+1])
        { nums[i]=nums[i]*2; 
        nums[i+1]=0;
        
    }}
        //a array is made to store the final result of the array and moving
        // all the zeros at the last position of the array
         int[] result = new int[nums.length];
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0)
                result[k++] = nums[i];
        }
        
        return result;
            
    
    
}
}