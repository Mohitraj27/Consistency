class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum+= nums[i];
        }
        int leftSum =0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            if((leftSum-(totalSum - leftSum )) % 2 == 0){
            count++;
            }
        }
        return count;
    }
}