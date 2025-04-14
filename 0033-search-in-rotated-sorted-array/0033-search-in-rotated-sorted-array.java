class Solution {
    public int search(int[] arr,int target) {
        /* Using Two Ptr Approach 
        Time - O(N/2)
        Space - O(1)
        1. Intialize left pointer to zeroth index and right ptr to last index
        2. Itertae throughout the array until left ptr <= right ptr
        3. add two check if the right or left ptr index element matches with the target element 
        then return tht element else return -1;
        
        */
        int left=0,right=arr.length-1;
        while(left<=right){
            if(arr[left]==target){
                return left;
            }
            if(arr[right]==target){
                return right;
            }
            left++;
            right--;
        }
        return -1;
    }
}