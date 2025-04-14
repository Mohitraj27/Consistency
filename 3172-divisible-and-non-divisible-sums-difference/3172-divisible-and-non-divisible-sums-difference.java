class Solution {
    public int differenceOfSums(int n, int m) {
        // Time - O(N) Space O(1)
        int nums1=0,nums2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                nums1+=i;
            }else{
                nums2+=i;
            }
        }
        return nums2-nums1;
    }
}