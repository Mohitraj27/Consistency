class Solution {
    public int search(int[] arr,int target) {
        /*
        Brute Force Approach
        Time - O(N)
        */
        int i=0;
        while(i<=arr.length-1){
            if(arr[i]==target){
                return i;
            }
            i++;
        }
        return -1;
    }
}