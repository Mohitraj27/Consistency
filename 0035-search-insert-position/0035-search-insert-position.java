class Solution {
    public int searchInsert(int[] arr, int target) {
        int low =0,high=arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }   else if(arr[mid]<target){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}