class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length == 0 || nums == null){
            return 0;
        }
        
        Arrays.sort(nums);
        
        int ans = 1;
        int prev = nums[0];
        int cur = 1;
        
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == prev+1){
                cur++;
            }
            else if(nums[i] != prev){
                cur = 1;
            }
            prev = nums[i];
            ans = Math.max(ans, cur);
        }
        return ans;    
    }
}