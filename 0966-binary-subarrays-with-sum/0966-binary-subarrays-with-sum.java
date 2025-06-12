class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int res = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);
        for(int i = 0;i < nums.length;i++){
            prefixSum += nums[i];
            res += map.getOrDefault(prefixSum-goal,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return res;  
    }
}