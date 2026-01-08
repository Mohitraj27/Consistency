class Solution {
    public void moveZeroes(int[] arr) {
        int low=0;

        for(int i=0;i<arr.length;i++){

        if(arr[i]!=0){
            int temp = arr[i];
            arr[i]=arr[low];
            arr[low]=temp;
            low++;
        }
        }
    }
}