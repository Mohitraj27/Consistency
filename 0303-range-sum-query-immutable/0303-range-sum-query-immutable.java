class NumArray {
int []nums;
    public NumArray(int[] nums) {
      this.nums =new int [nums.length]; 
      this.nums[0]=nums[0]; 
      for(int i=1;i<nums.length;i++){
       this.nums[i]=this.nums[i-1]+nums[i];
      }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0)return nums[right];
        return nums[right]-nums[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */