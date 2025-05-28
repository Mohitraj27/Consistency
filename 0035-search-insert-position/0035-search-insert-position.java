class Solution {
    public int searchInsert(int[] nums, int target) {
    int low,high,mid;
        low=0;
        high=nums.length-1;
        mid=low+(high-low)/2;
       if(nums[0]>target)
           return 0;
        while(low<=high)
        {
         mid=low+(high-low)/2;
            if(nums[mid]==target)
                
                return mid;
            else if(nums[mid]>target&&nums[mid-1]<target)
                return mid;
                
            else if(nums[mid]>target)
                high=mid-1;
                
            else if(nums[mid]<target)
               low=mid+1;
        }
      return nums.length;
    }
}