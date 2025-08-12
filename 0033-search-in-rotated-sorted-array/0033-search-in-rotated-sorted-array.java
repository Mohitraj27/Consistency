class Solution {
    public int search(int[] arr, int target) {
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target) return mid;

            // check which part of array is sorted left or right sub part
            if(arr[low] <= arr[mid]){
                // left is sorted
                if(arr[low]<=target && target <= arr[mid]){
                    //to check whether the target value lies inside 
                    high = mid-1;
                }else{
                    low = mid+1;
                }

            } else{
                // right is sorted
                if(arr[mid+1] <= target && target <= arr[high]){
                    // check whether the target value exist in the right half or not
                    low =mid+1;
                }else{
                    high =mid-1;
                }
            }
        } return -1;

        // Time - O(LogN)
    }
}