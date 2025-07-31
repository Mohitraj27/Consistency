class Solution {
    public int findNumbers(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int count = 0;
      for(int i=0;i<nums.length;i++){
        int numOfDgits=0;
        while(nums[i]!=0){
            nums[i]= nums[i]/10;
            numOfDgits++;
        }
        if(numOfDgits%2==0){
            count++;
        }
      }
      return count;   
    }
}