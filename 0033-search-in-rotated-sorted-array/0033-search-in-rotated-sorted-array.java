class Solution {
    public int search(int[] nums, int target) {
      
        //Using linear Search technique
        for(int i=0;i<nums.length;i++)
        {
            //Iterating through each element and checking for the target value
            if(nums[i]==target)
            {return i;
        }}
        // condition if not target values gets matched 
        return -1;
        
    }
}