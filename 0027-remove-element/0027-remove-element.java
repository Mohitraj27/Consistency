class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0)
        {
            return n;
        }
        for(int i=1;i<n;i++)
        {
            if(nums[i-1]==val)
            {
                int j=i;
                while(j<n)
                {
                    nums[j-1]=nums[j];
                    j++;
                }
                n--;
                i--;
            }
            
        }
        if(nums[n-1]==val)
            n--;
        return n;
    }
}