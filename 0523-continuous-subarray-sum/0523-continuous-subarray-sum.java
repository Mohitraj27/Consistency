class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        //int n=nums.length;
         
         for(int i=1;i<nums.length;i++)
        {   //This if condition is for end testcases for first and last elements zeros
            if(nums[i]==0 && nums[i-1]==0)
               return true;
         }
            //Interating through elements and finding the sum of subarrays
            for(int i=1;i<nums.length;i++)
            {
                //Storing the subarrays in nums[i]
                nums[i]+=nums[i-1];
                //Checking the condition for multple of k
                if(nums[i]%k==0)
                    return true;
                int j=i;
                //If both the condition for good subarrays are true return true 
                //else false
                while(j>1 && nums[i]>k)
                {  if((nums[i]-nums[j-2])%k==0)
                    {
                        return true;
                    }
                j--;
            }
        }
        return false;
}
}