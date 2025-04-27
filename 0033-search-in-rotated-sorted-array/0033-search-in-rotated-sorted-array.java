class Solution {
    public int search(int[] arr,int target) {
        /**
        Optimized Approch Using Binary Search Algorithm 
        Step 1. Intialize Two Pointer Left to Starting Index and Right to last Index of the Array
        Step 2. Calculate the Middle Index also check if middle index is the Target then return that
        Step 3. Now,Determine Which Side either left or right half of the array is sorted 
        Case A : If left Half is sorted 

        This means the values from `low` to `mid` are in ascending order.

        Check if the target lies in this sorted range:

        Case B: If right Half is sorted 

        This means the values from `mid` to `high` are sorted.

        Check if the target lies in this sorted half
 */
       int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target) return mid;
        
            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }   
}


