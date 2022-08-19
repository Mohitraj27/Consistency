/* Leetcode Problem 217 Contains Duplicate
 Problem Statement:
 Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.
 */

import java.util.Arrays;
class Day_61 {
    public boolean containsDuplicate(int[] arr) {
    Arrays.sort(arr);
        
        for(int i = 0 ; i < arr.length -1; i++)
        {
            if(arr[i] == arr[i+1])
                return true;
        }
        return false;
    }
}

/* Sample Test Cases
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
 */