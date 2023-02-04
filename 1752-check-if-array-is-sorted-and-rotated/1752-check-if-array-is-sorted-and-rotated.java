class Solution {
    public boolean check(int[] nums) {
        
        int k=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            //here we used (i+1)%n to check last element with the first element
            if(nums[i]>nums[(i+1)%n]) 
            {
                k++;
            }
           }
        
        
         if(k>1)
                return false;
            else return true;
        
    }
}