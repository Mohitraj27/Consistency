class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int i = 0;

        while (i < nums.length - 1) {

            if (nums[i + 1] != nums[i]) {

                nums[k++] = nums[i];

            }

            i++;

        }
        nums[k++] = nums[nums.length - 1];

        return k;
    }
}