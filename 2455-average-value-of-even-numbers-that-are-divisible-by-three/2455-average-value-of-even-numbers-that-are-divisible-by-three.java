class Solution {
    public int averageValue(int[] nums) {
        
        
        int count_even=0,sum_even=0;
        for(final int i : nums)
        {
            if(i % 6 ==0)
            {
                 count_even++;
            
                sum_even+=i;
               }
            
            
        }
        return count_even ==0 ? 0 : sum_even/count_even;
        
        }
}
