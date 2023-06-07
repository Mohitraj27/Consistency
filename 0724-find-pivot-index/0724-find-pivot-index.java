class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        // time > O(n)
		// calculating prefix sum array and storing it in nums only, you can create a new array also if you want
        // this iteration is for calculating all left sum starting from 1st index position 
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        
        
        for(int i=0;i<n;i++){
		 // when 0th index ,means there are no elements on the left so we check sum of elements to the 
            // right is zero if it exist then return the index value i.e 0
            if(i==0){                            // for i=0
                if(nums[n-1]-nums[i]==0)        // condition
                    return i;
            }
			
            // now checking for the index > 0 we check sum of elements on left == that of right 
            else{                                  // for i=1,2,3...
                if(nums[i-1]==nums[n-1]-nums[i])   // condition
                    return i;
            }
        }
        // if no such iteration found loop terminates and -1 is returned 
        return -1;     // when no pivot element is present
    }
}