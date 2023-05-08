class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
//        // Arrays.sort(nums);
//          if (nums == null || nums.length <= 1 || k <= 0) {
//             return false;
//         } int len = nums.length;
//         for (int i = 0; i < len; i++) {
//             for (int j = i + 1; j < len; j++) {
//                 if (nums[i] == nums[j]) {
//                     if (Math.abs(i - j) <= k) {
//                         return true;
//                     }
//                 }
//             }
//         }

//         return false;
// My above approach exceeds time limit
        
        //Below approach using HashSet
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
} 
 }

        