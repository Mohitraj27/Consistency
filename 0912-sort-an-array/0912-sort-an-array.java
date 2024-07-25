class Solution {
    public int[] sortArray(int[] nums) {
         var map = new int[100001];

    for (var n : nums)
      map[n + 50000]++;

    var k = 0;
    for (var i = 0; i < 100001; i++)
      for (var j = 0; j < map[i]; j++)
        nums[k++] = i - 50000;

    return nums;
    }
}