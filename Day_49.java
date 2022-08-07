/* Leetcode Problem 35. Search Insert Position
 * 
 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
*/
 
class Day_49

 {
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

/* Test Cases 
Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/