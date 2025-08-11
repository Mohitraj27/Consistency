class Solution {
    public int search(int[] nums, int target) {
        // Brute -force approach using Linear Search O(N)
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}