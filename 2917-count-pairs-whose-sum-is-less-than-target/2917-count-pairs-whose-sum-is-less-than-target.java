class Solution {
    public int countPairs(List<Integer> nums, int target) {
        /*
        Using Two ptr approach 
        time - O(NLogN) Space O(1)

        */
        Collections.sort(nums); 
        int i=0,j=nums.size()-1;
        int count = 0;
        while(i<j){
            int sum = nums.get(i) + nums.get(j);

            if (sum < target) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}