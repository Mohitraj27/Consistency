class Solution {
    public int triangleNumber(int[] nums) {
        
        //Brute-force Approach
        int count_triangle=0;
        Arrays.sort(nums);
        /*After sorting element are arranged so it is easier for iterating each elements 
        This is for intial element comparing with other two such 
        Property of a Valid Triangle -> A+B>C 
        
        
        */
        for(int i=0;i<nums.length-2;i++)
        //
            for(int j=i+1;j<nums.length-1;j++)
            
                for(int k=j+1;k<nums.length;k++)
                
                    if(nums[i]+nums[j]>nums[k])
                        count_triangle ++;
                    
                
            return count_triangle;
        
    }
}