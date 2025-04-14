class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; // k should not be larger than n 
        reverse(nums,0,n-1); // Reverse the entire array First 
        reverse(nums,0,k-1); // Reverse the first k Element 
        reverse(nums,k,n-1); // reverse the remaning Element
        
    }
    public void reverse(int []nums,int i, int j){
        while(i< j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
    }
}