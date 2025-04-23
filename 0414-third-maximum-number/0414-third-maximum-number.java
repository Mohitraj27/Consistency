class Solution {
    public int thirdMax(int[] nums) {
         Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        
        for (int i = nums.length - 1; i >= 0 && set.size() < 3; i--) {
            set.add(nums[i]);
        }

        if (set.size() < 3) {
            return Collections.max(set); 
        } else {
            List<Integer> list = new ArrayList<>(set);
            return Collections.min(list);
        }
    }
}