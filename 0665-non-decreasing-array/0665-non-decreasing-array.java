class Solution {
    public boolean checkPossibility(int[] nums) {


        /**
         Thought process is like 
         Count how many times the array violates non-decreasing order
If violations > 1 → return false
When violation occurs, decide whether to adjust:
previous element (nums[i-1])
OR current element (nums[i])
         */
         int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;

                if (count > 1) {
                    return false;
                }

                // Decide which element to modify
                if (i == 1 || nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i];  // modify previous element
                } else {
                    nums[i] = nums[i - 1];  // modify current element
                }
            }
        }

        return true;
    }
}