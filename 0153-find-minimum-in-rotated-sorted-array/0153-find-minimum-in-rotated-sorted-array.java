class Solution {
    public int findMin(int[] nums) {
        
 int n = nums.length;
        
        
//         //using linear search technique
//         // brute-force approach 
//     // Traversing over array to
//     // find minimum element
//     for (int i = 0; i < n; i++) {
//       if (arr[i] < min_ele) {
//         min_ele = arr[i];
//       }
//     }
 
//     return min_ele;
        
        //Optimized approach using bianry search
        // time - o(log n) space -O(1)
       
        
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[end]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return nums[end];
        }
    
}