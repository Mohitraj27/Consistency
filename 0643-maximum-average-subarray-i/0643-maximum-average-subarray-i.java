class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // Compute initial window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // Remove leftmost, add rightmost
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k; // Return the maximum average
    }
}