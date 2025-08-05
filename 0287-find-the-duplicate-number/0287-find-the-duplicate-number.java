class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> result =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(result.contains(nums[i])){
                return nums[i];
            }
            result.add(nums[i]);
        }
        return 0;
    }
}