class Solution {
    public int removeDuplicates(int[] nums) {
      if(nums.length==0) return 0;
       int j = 1;  // Pointer for the next unique element's position
        
        // Start from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];  // Assign the unique element to position `j`
                j++;  // Move `j` to the next position
            }
        }
        
        // Return the number of unique elements
        return j;

    }
}