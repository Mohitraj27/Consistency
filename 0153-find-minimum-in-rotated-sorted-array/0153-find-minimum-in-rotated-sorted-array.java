class Solution {
    public int findMin(int[] arr) {
        int min_ele = arr[0];
 int n = arr.length;
        //using linear search technique
    // Traversing over array to
    // find minimum element
    for (int i = 0; i < n; i++) {
      if (arr[i] < min_ele) {
        min_ele = arr[i];
      }
    }
 
    return min_ele;
    }
}