
/* Leetcode Problem  1512. Number of Good Pairs
 * Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*/
 

class Day_54 {
    public int numIdenticalPairs(int[] nums) {
      int x = 0;
for(int i = 0; i<nums.length;i++){
for(int j = i+1; j<nums.length;j++){
if(nums[i] == nums[j]){
x++;
}
}
}
return x;  
    }
}
/* Sample Test Cases
 Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are goo
 */