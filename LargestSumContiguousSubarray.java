// KAdane's algorithm (Largest Sum Contiguous Subarray)
 // Given an array of integers, find the contiguous subarray with the largest sum.
 // Example: Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 (subarray: [4,-1,2,1])

 import java.util.*;
 class LargestSumContiguousSubarray {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array:");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter the elements of the array:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         sc.close();
         int maxSum = kadane(arr);
         System.out.println("Largest Sum Contiguous Subarray: " + maxSum);
     }

     public static int kadane(int[] arr) {
         int max_sum = arr[0];
         int current_Sum = arr[0];
         
         for (int i = 1; i < arr.length; i++) {
             current_Sum = Math.max(arr[i], current_Sum + arr[i]);
             max_sum = Math.max(max_sum, current_Sum);
         }
         
         return current_Sum;
     }
 }
