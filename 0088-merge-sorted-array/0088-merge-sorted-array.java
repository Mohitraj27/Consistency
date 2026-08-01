class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int arr[]=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<m){
            arr[k++]=nums1[i++];
        }
        while(j<n){
            arr[k++]=nums2[j++];
        }

        for(int p=0;p<m+n;p++){
            nums1[p]=arr[p];
        }

    }
}