class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res = 0;
        int left = 0;
        int sum = 0;
        Set<Integer> set= new HashSet<>();
        for(int right = 0; right < nums.length; right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            sum += nums[right];
            set.add(nums[right]);
            res = Math.max(res,sum);
        }
        return res;
    }
}
/**
    Iterate through each elements of the array
    Check if the elemnt exist in the set if not then add andupdate the set and sum also the result
    now if the duplicates element found then remove that left element from the set and increment the left ptr by 1 
    this way keep on checking the duplciates elements in the subarray and check each time the maximum value of subarray
    return that res after iteration completes Time O(N) Space O(N)
 */