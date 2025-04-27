class Solution {
    public List<Long> minOperations(int[] nums, int[] queries) {
       Arrays.sort(nums);
    List<Long> ans = new ArrayList<>();
    int n = nums.length;
    long[] prefix = new long[n + 1];
    for (int i = 1; i <= n; i++)
        prefix[i] = prefix[i - 1] + nums[i - 1];
    for (int x: queries) {
        int i = bisect_left(nums, x);
        ans.add(1L * x * (2 * i - n) + prefix[n] - 2 * prefix[i]);
    }
        return ans;
    }

    private int bisect_left(int[] nums, int x) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < x) lo = mid + 1;
            else hi = mid;
        }
    return lo;
    }

}