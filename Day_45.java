//LeetCode Problem No 238. Product of Array Except Self
/* Problem Statement 
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 */
class Day_45 {
    public int[] productExceptSelf(int[] nums) {
         int len=nums.length;
        
        //Array to store the product of arrays element
        int res[]=new int[len];
        
        //to find the product of elements before the elements except itself
        int productbeforeSelf=1;
        //To find the product of elements after the elements except itself
        int productafterSelf=1;
        
        for(int i=0;i<len;i++)
        {
            res[i]=productbeforeSelf;
            productbeforeSelf*=nums[i];
        }
        for(int i=len-1;i>=0;i--)
        {
            res[i]*=productafterSelf;
            productafterSelf*=nums[i];
        }
        
    
        return res;
        
    }
}
/*
 * 
 * Test Cases
 Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
 */