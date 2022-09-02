
//Leetcode Problem 287 Find the duplicate Number
/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 */
class Day_75 {
    public int findDuplicate(int[] nums) {
        
        int arr[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==0)
                arr[nums[i]]=1;
            else
                return nums[i];
        }
        return 0;
    }
}
//Sample Test Cases
/*
 Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 */