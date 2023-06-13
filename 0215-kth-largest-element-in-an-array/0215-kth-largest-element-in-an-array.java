class Solution {
    public int findKthLargest(int[] arr, int k) {
       //1->2->3->4->5->6 
        
     //Brute-force approach
     /* Brute force algo
     1. first we'll sort the elements of the array
     2. take an extra array with k for storing the largest elements
     3. now using two ptrs. low is intislzied with 0 value & high with last index value
     4. Iterating through elements of array using while loop such that intial value should be less
     than K
     5. last k elements will be stored in resulting array and when the size of array reaches n
     while loop will terminate and resulting array will be returned.
     
     time - O(N) space - O(N)
//      */
        
//         int n=arr.length;
//      Arrays.sort(arr);
//      int []res=new int[k];
//      //two ptr approach
//      int low=0,high=n-1;
//         //  int index = 0;
//      while(low<k){
//          res[low]=arr[high];
//          low++;
//          high--;
//          //index++;
//      }
//     return res;
        Arrays.sort(arr);

        int n = arr.length;

        // Return the kth largest element
        return arr[n - k];
    }
}