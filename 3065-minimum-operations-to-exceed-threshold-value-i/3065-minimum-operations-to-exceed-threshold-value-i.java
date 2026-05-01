class Solution {
    public int minOperations(int[] nums, int k) {
        /**
        for this problem statemnet my intutuion was that first we keep a count with all those element present within the array that is greater than equal to k if it is then incremnt counter by 1 and this will contiunye till the length of the array if not then move to the next index of the array element and then compare and so on till the length of the array and at last when the while loop terminates then return the counter by n-totalCount 
 */
        int count=0;
        int i=0;
        int n=nums.length;
        while(i<n){
            if(nums[i]>=k){
                count++;
            }i++;
        }
        return n-count;
    }
}