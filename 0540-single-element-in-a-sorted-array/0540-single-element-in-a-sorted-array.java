class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Brute-force approach
        //Travesering through each element of the array
        for(int i=1;i<nums.length;i=i+2)
        {
            //if the current element is not equal to the previous element 
            // that means it's a single element present cause the array is sorted
            if(nums[i]!=nums[i-1])
                return nums[i-1];
        }
        
        //this is for the last element which might presnt 
        return nums[nums.length-1];
        
        
        
    }
}